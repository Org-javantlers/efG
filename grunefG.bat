@echo off
REM Correr exemplos
REM Mesmo em gramáticas separadas só se pode usar o prefixo da gramáticas para o grun
REM Por isso, MONTyPythonLexer e MONTyPythonParser, pertendem à gramática MONTyPython
REM É importante ter consistência na nomenclatura
cd Grammar
grun Expr prog -gui < exemplo.txt
popd
exit

