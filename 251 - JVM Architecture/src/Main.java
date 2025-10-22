/*
 * JVM ARCHITECTURE
 *
 * Virtual Machine
 * ----------------
 * It is a software simulation of a machine that performs operations like a physical machine.
 *
 * There are two types of Virtual Machines:
 * - Hardware or System-based VM
 * - Application or Process-based VM
 *
 * Hardware or System-based Virtual Machine
 * ----------------------------------------
 * - Provides multiple logical systems on a single physical machine (e.g., VMware, KVM, Cloud hypervisors).
 * - Advantage: hardware resource sharing and better utilization.
 *
 * Application or Process-based Virtual Machine
 * --------------------------------------------
 * - Acts as a runtime engine to execute a specific programming language.
 * - Example: JVM (Java Virtual Machine) executes Java bytecode.
 *
 * JVM
 * ----
 * JVM is part of the JRE and is responsible for loading, verifying, and executing Java bytecode.
 * It provides platform independence by converting bytecode into native machine code.
 *
 * ==========================================================
 *               BASIC ARCHITECTURE DIAGRAM OF JVM
 * ==========================================================
 *
 *                       +--------------------------+
 *                       |       Class Loader       |
 *                       +-----------+--------------+
 *                                   |
 *                                   v
 *            +---------------------------------------------+
 *            |       Various Memory Areas of JVM (Runtime) |
 *            |---------------------------------------------|
 *            |                 Method Area (Metaspace)     |
 *            |                 Heap Area                   |
 *            |                 Stack Area                  |
 *            |                PC Registers                 |
 *            |             Native Method Stack             |
 *            +---------------------------------------------+
 *                                   |
 *                                   v
 *                       +--------------------------+
 *                       |     Execution Engine     |
 *                       +--------------------------+
 *                                   |
 *                                   v
 *                     +-----------------------------+
 *                     | Native Method Interface (JNI)|
 *                     +-----------------------------+
 *                                   |
 *                                   v
 *                     +-----------------------------+
 *                     |   Native Method Libraries   |
 *                     +-----------------------------+
 *
 * NOTE:
 * - The Execution Engine can access JVM memory areas (Heap, Stack, Method Area)
 *   to fetch bytecode, variables, and objects for execution.
 * - The memory areas can also interact with the Execution Engine during runtime.
 *
 * ==========================================================
 *                  CLASS LOADER SUBSYSTEM
 * ==========================================================
 *
 * Responsible for:
 * - Loading
 * - Linking
 * - Initialization
 *
 * -----------------
 * 1 Loading
 * -----------------
 * - Reads the .class file and stores corresponding binary data in the Method Area (now Metaspace).
 * - For each class, JVM stores:
 *   - Fully qualified class name
 *   - Parent class name
 *   - Method information
 *   - Variables and constants
 *   - Modifiers and constructors
 *
 * After loading, JVM creates an object of java.lang.Class in the Heap that represents class metadata.
 *
 * -----------------
 * 2 Linking
 * -----------------
 * Linking = Verify + Prepare + Resolve
 *
 * - Verify → Ensures the class file is structurally correct and safe.
 * - Prepare → Allocates memory for static variables and assigns default values.
 * - Resolve → Replaces symbolic references with actual memory references.
 *
 * -----------------
 * 3 Initialization
 * -----------------
 * - Assigns original values to static variables.
 * - Executes static blocks (top to bottom, parent to child).
 *
 * Class Loading Process:
 *
 *                      +---------------+
 *                      |     Verify    |
 *                      +---------------+
 * +---------------+    +---------------+    +----------------------+
 * |    Loading    | -> |     Prepare   | -> |    Initialization    |
 * +---------------+    +---------------+    +----------------------+
 *                      +---------------+
 *                      |     Resolve   |
 *                      +---------------+
 *
 * ==========================================================
 *                TYPES OF CLASS LOADERS 
 * ==========================================================
 *
 * +---------------------------+
 * |  Bootstrap Class Loader   |  <-- Loads core Java classes (java.base module)
 * +---------------------------+
 *             ^
 *             |
 * +---------------------------+
 * |  Platform Class Loader    |  <-- (Replaces Extension Class Loader)
 * |  Loads platform libraries |
 * +---------------------------+
 *             ^
 *             |
 * +---------------------------+
 * | Application Class Loader  |  <-- Loads from application classpath
 * +---------------------------+
 *
 * - Java 8 and before:
 *     - Extension Class Loader used to load from /lib/ext
 *     - Core classes came from rt.jar
 *
 * - Java 9 and above:
 *     - rt.jar and ext directories removed.
 *     - Modular system introduced (Jigsaw Project).
 *     - Extension Loader replaced by Platform Class Loader.
 *
 * Delegation Hierarchy Principle
 * -------------------------------
 * 1. Application Class Loader → Platform Class Loader → Bootstrap Loader.
 * 2. Each loader delegates the class-loading request upward before loading itself.
 * 3. Prevents duplicate loading of core classes.
 *
 * ==========================================================
 *                  JVM MEMORY AREAS 
 * ==========================================================
 *
 * 1 Method Area (Metaspace)
 * ---------------------------
 * - Stores class-level data (method info, static variables, constant pool).
 * - From Java 8, replaced "PermGen" with "Metaspace" (stored in native memory).
 *
 * 2 Heap Area
 * -------------
 * - Stores all Java objects and their instance variables.
 * - Shared among all threads.
 * - Managed by Garbage Collector.
 *
 * 3 Stack Area
 * --------------
 * - Each thread has its own stack.
 * - Contains method call frames, local variables, and intermediate results.
 * - Thread-safe since private to each thread.
 *
 * Each Stack Frame:
 * +--------------------------+
 * |  Local Variable Area     |
 * +--------------------------+
 * |  Operand Stack           |
 * +--------------------------+
 * |  Frame Data              |
 * +--------------------------+
 *
 * 4 PC Registers
 * ----------------
 * - Each thread has its own PC (Program Counter).
 * - Stores the address of the current instruction being executed.
 *
 * 5 Native Method Stack
 * -----------------------
 * - Used for native (non-Java) methods written in C/C++.
 *
 * ==========================================================
 *                 EXECUTION ENGINE 
 * ==========================================================
 *
 * - Central component that executes bytecode.
 * - Components:
 *   - Interpreter → Executes bytecode line by line.
 *   - JIT Compiler → Converts hot methods into native code for performance.
 *   - Profiler → Detects frequently executed ("hot spot") methods.
 *
 * Modern JVMs may use:
 *   - C1 (Client) and C2 (Server) compilers
 *   - Graal JIT or AOT (Ahead-of-Time Compilation)
 *
 * ==========================================================
 *              JAVA NATIVE INTERFACE (JNI)
 * ==========================================================
 *
 * - Acts as a bridge between JVM and native libraries.
 * - Provides metadata and linkage for native method execution.
 * - Native Method Libraries are implemented in C/C++.
 *
 * ==========================================================
 *              EVOLUTION SUMMARY
 * ==========================================================
 * - Java 7 and earlier:
 *     - PermGen space used for class metadata.
 *     - Extension Class Loader loaded from /lib/ext.
 *     - rt.jar contained all Java core classes.
 *
 * - Java 8:
 *     - Introduced Metaspace (replaces PermGen).
 *
 * - Java 9+:
 *     - Introduced Module System (Jigsaw).
 *     - Removed rt.jar and ext directories.
 *     - Replaced Extension Class Loader with Platform Class Loader.
 *     - Improved JIT and introduced AOT Compilation.
 *
 */

public class Main {
    public static void main(String[] args) {

    }
}
