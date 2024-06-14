# efG
Pronto a correr em linha de comandos windows.
grun Expr prog -gui < exemplo.txt

ou no caso do InteliJ, basta ter o ANTLR PREVIEW para ver a PARSE TREE.

                            )    *    (   (   (                           )   
                     (  ( /(  (  `   )\ ))\ ))\ )   (       (    (    ( /(   
                     )\ )\()) )\))( (()/(()/(()/(   )\      )\   )\   )\())  
                   (((_|(_)\ ((_)()\ /(_))(_))(_)|(((_)(  (((_|(((_)(((_)\   
                   )\___ ((_)(_()((_|_))(_))(_))  )\ _ )\ )\___)\ _ )\ ((_)  
                  ((/ __/ _ \|  \/  | _ \_ _| |   (_)_\(_|(/ __(_)_\(_) _ \  
                   | (_| (_) | |\/| |  _/| || |__  / _ \  | (__ / _ \| (_) | 
                    \___\___/|_|  |_|_| |___|____|/_/ \_\  \___/_/ \_\\___/                                                    

Pra quem quiser mais detalhes, aqui está o HowTo:
Efólio Global
Seguir os passos do tutorial https://www.youtube.com/watch?v=pa8qG0I10_I
Testar na linha de comandos do Windows.
Depois, de ter tudo instalado e a funcionar, se algo estiver mal verificar de novo o tutorial.

1 - 
Primeiro entrar em CMD

2 - 
Depois ir para a pasta onde está a gramática: (...)\efG\Grammar

3 - 
Ficheiros java da gramátia ANTLR4, atenção lexer e parser estão separados
criar os ficheiros java do lexer com: 
antlr4 ExprLexer.g4 
depois criar os ficheiros java do parser com:
antlr4 ExprParser.g4

4 -  
Compilar todos os ficheiros da gramática
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
exemplo.txt é um ficheiro que está no mesmo diretório da gramática

6 -
Aparece uma imagem da arvore no Parse Tree Inspector
