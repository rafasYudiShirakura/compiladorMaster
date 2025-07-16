@echo off
echo Generating AST Image...

REM Check if Graphviz dot command is available
where dot >nul 2>nul
if %ERRORLEVEL% == 0 (
    echo Graphviz found! Generating AST image...
    dot -Tpng ast_graph.dot -o ast_graph.png
    if exist ast_graph.png (
        echo ✅ AST image generated successfully: ast_graph.png
        echo Opening image...
        start ast_graph.png
    ) else (
        echo ❌ Failed to generate AST image
    )
) else (
    echo ⚠️  Graphviz not found in PATH
    echo.
    echo To install Graphviz:
    echo 1. Download from: https://graphviz.org/download/
    echo 2. Install and add to system PATH
    echo 3. Restart command prompt
    echo 4. Run this script again
    echo.
    echo Alternative: Install via Chocolatey:
    echo    choco install graphviz
    echo.
    echo Or via Winget:
    echo    winget install Graphviz.Graphviz
)

pause