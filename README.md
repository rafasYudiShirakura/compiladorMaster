PASSO A PASSO DE COMO RODAR:
2. Configure the ANTLR Plugin

Next, ensure the ANTLR plugin is configured correctly to generate the parser and lexer files into the right directory.

    Go to File > Settings (or IntelliJ IDEA > Preferences on macOS).

    Navigate to Languages & Frameworks > ANTLR v4.

    In the "ANTLR Properties" section, look for the "Output directory for generated sources" field.

    Set this field to src/main/gen. This tells the plugin to place the generated Java files (like ObjectOrientedLexer.java and ObjectOrientedParser.java) into this specific directory. This is a crucial step to keep your generated code separate from your handwritten code.


3. Mark the Generated Sources Directory

You need to tell IntelliJ that the src/main/gen directory contains source code that should be compiled along with the rest of your project.

    In the Project view (usually on the left), right-click on the src/main/gen directory.

    From the context menu, select Mark Directory as > Generated Sources Root.

    The directory should turn blue, indicating that IntelliJ now recognizes it as a source folder.

After this step, IntelliJ should be able to resolve the org.example.ObjectOrientedLexer and org.example.ObjectOrientedParser classes used in your Main.java and MyLanguageSemanticAnalyzer.java files.

4. Create a Run Configuration

To run your compiler, you need to create a "Run Configuration" for the Main class and tell it which source file to compile.

    Open the Main.java file in the editor.

    Right-click anywhere inside the public static void main(String[] args) method.

    Select Run 'Main.main()'. This will likely fail because no input file is provided, but it creates a run configuration for you.

    Now, go to the top-right corner of the IntelliJ window, click on the run configuration dropdown (it should say "Main"), and select Edit Configurations....

    In the "Run/Debug Configurations" window, find the "Program arguments" field.

    Here, you need to provide the path to a test file for your language. For example, you could create a file named test.mylang in the root of your project with some sample code like:

    componenteModelo MyClass {
        // Your custom language code here
    }

    In the "Program arguments" field, enter the path to this file (e.g., test.mylang).

    Click Apply and then OK.

5. Build and Run Your Compiler

Now you are ready to build and run your project.

    From the main menu, select Build > Build Project. This will compile all your Java files, including the ones in src/main/java and the generated ones in src/main/gen.

    Click the green Run button (a triangle icon) in the top-right corner of the IntelliJ window.

The output of your compiler will appear in the Run tool window at the bottom of the screen. Based on your Main.java and MyLanguageSemanticAnalyzer.java files, you should see output like:

Processing: test.mylang

--- Running Semantic Analyzer (Listener) ---
Entering class: MyClass
Exiting class: MyClass
--- Semantic Analyzer Finished ---

Parsing completed successfully for: test.mylang

### NO CASO O TESTE NOS FAZ NO TEXTE.TXT TA OQUEI? FAZ OS PATH CERTINHO PRA RODAR TA OH KEI?


    
