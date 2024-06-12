# efG
Efólio Global

Seguir os passos do tutorial https://www.youtube.com/watch?v=pa8qG0I10_I

Testar na linha de comandos do Windows, este exemplo foi feito no desktop de casa.
Depois, de ter tudo instalado e a funcionar, se algo estiver mal verificar de novo o tutorial e ver a pasta problemas.

1 - Primeiro entrar em CMD
2 - Depois ir para a pasta onde está a gramática: (...)\efG\Grammar

3 - Ficheiros java da gramátia ANTLR4, atenção lexer e parser estão separados
criar os ficheiros java do lexer: antlr4 ExprLexer.g4 
criar os ficheiros java do parser: antlr4 ExprParser.g4

4 -  Compilar todos os ficheiros da gramática
compile Expr*.java
este comando compila todos os ficheiros java associados com a gramática Expr, isto é, cria as classes.
compile é um bat que está na lib/bin

5 - 
grun Expr prog -gui < exemplo.txt
O grun é para criar a arvore
Expr é o nome da gramática
prog é o ponto de entrada na gramática, usualmente nas primeiras linhas do parser.
-gui é um parametro que cria uma arvore de parser
< redireciona um ficheiro para o programa, tem de estar na mesmo diretório da gramática

7 -
Aparece uma imagem da arvore no Parse Tree Inspector

Nota: O Plugin ANTLR PREVIEW do InteliJ faz isto tudo automaticamente.
Só é preciso gerar o lexer através do ANTLR RECOGNIZER para dentro da mesma pasta onde está o parser.

Se nada for mudado... O ficheiro grunefG faz automaticamente o passo 6, basta clicar duas vezes.

