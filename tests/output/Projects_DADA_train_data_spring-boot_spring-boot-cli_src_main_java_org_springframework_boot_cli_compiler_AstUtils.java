<METHOD_START> public static boolean boolean ( ClassNode org.springframework.boot.cli.compiler.ClassNode , java.lang.String ... java.lang.String[] ) { if ( boolean ( ( AnnotatedNode ) org.springframework.boot.cli.compiler.ClassNode , java.lang.String[] ) ) { return true ; } for ( MethodNode org.springframework.boot.cli.compiler.MethodNode : org.springframework.boot.cli.compiler.ClassNode . getMethods ( ) ) { if ( boolean ( org.springframework.boot.cli.compiler.MethodNode , java.lang.String[] ) ) { return true ; } } return false ; }  <METHOD_END>
<METHOD_START> public static boolean boolean ( AnnotatedNode org.springframework.boot.cli.compiler.AnnotatedNode , java.lang.String ... java.lang.String[] ) { for ( AnnotationNode org.springframework.boot.cli.compiler.AnnotationNode : org.springframework.boot.cli.compiler.AnnotatedNode . getAnnotations ( ) ) { for ( java.lang.String java.lang.String : java.lang.String[] ) { if ( PatternMatchUtils . simpleMatch ( java.lang.String , org.springframework.boot.cli.compiler.AnnotationNode . getClassNode ( ) . getName ( ) ) ) { return true ; } } } return false ; }  <METHOD_END>
<METHOD_START> public static boolean boolean ( ClassNode org.springframework.boot.cli.compiler.ClassNode , java.lang.String ... java.lang.String[] ) { java.util.Set<java.lang.String> < java.lang.String > java.util.Set<java.lang.String> = new java.util.HashSet<java.lang.String> <> ( java.util.Arrays . java.util.List<java.lang.String> ( java.lang.String[] ) ) ; for ( FieldNode org.springframework.boot.cli.compiler.FieldNode : org.springframework.boot.cli.compiler.ClassNode . getFields ( ) ) { if ( java.util.Set<java.lang.String> . boolean ( org.springframework.boot.cli.compiler.FieldNode . getType ( ) . getName ( ) ) ) { return true ; } } for ( MethodNode org.springframework.boot.cli.compiler.MethodNode : org.springframework.boot.cli.compiler.ClassNode . getMethods ( ) ) { if ( java.util.Set<java.lang.String> . boolean ( org.springframework.boot.cli.compiler.MethodNode . getReturnType ( ) . getName ( ) ) ) { return true ; } } return false ; }  <METHOD_END>
<METHOD_START> public static boolean boolean ( ClassNode org.springframework.boot.cli.compiler.ClassNode , java.lang.String ... java.lang.String[] ) { for ( java.lang.String java.lang.String : java.lang.String[] ) { if ( org.springframework.boot.cli.compiler.ClassNode . getSuperClass ( ) . getName ( ) . equals ( java.lang.String ) ) { return true ; } } return false ; }  <METHOD_END>
<METHOD_START> public static boolean boolean ( ClassNode org.springframework.boot.cli.compiler.ClassNode , java.lang.String ... java.lang.String[] ) { java.util.Set<java.lang.String> < java.lang.String > java.util.Set<java.lang.String> = new java.util.HashSet<java.lang.String> <> ( java.util.Arrays . java.util.List<java.lang.String> ( java.lang.String[] ) ) ; for ( ClassNode org.springframework.boot.cli.compiler.ClassNode : org.springframework.boot.cli.compiler.ClassNode . getInterfaces ( ) ) { if ( java.util.Set<java.lang.String> . boolean ( org.springframework.boot.cli.compiler.ClassNode . getName ( ) ) ) { return true ; } } return false ; }  <METHOD_END>
<METHOD_START> public static org.springframework.boot.cli.compiler.ClosureExpression org.springframework.boot.cli.compiler.ClosureExpression ( BlockStatement org.springframework.boot.cli.compiler.BlockStatement , java.lang.String java.lang.String , boolean boolean ) { for ( ExpressionStatement org.springframework.boot.cli.compiler.ExpressionStatement : java.util.List<org.springframework.boot.cli.compiler.ExpressionStatement> ( org.springframework.boot.cli.compiler.BlockStatement ) ) { Expression org.springframework.boot.cli.compiler.Expression = org.springframework.boot.cli.compiler.ExpressionStatement . getExpression ( ) ; if ( org.springframework.boot.cli.compiler.Expression instanceof MethodCallExpression ) { ClosureExpression org.springframework.boot.cli.compiler.ClosureExpression = org.springframework.boot.cli.compiler.ClosureExpression ( java.lang.String , ( MethodCallExpression ) org.springframework.boot.cli.compiler.Expression ) ; if ( org.springframework.boot.cli.compiler.ClosureExpression != null ) { if ( boolean ) { org.springframework.boot.cli.compiler.BlockStatement . getStatements ( ) . remove ( org.springframework.boot.cli.compiler.ExpressionStatement ) ; } return org.springframework.boot.cli.compiler.ClosureExpression ; } } } return null ; }  <METHOD_END>
<METHOD_START> private static java.util.List<org.springframework.boot.cli.compiler.ExpressionStatement> < ExpressionStatement > java.util.List<org.springframework.boot.cli.compiler.ExpressionStatement> ( BlockStatement org.springframework.boot.cli.compiler.BlockStatement ) { java.util.ArrayList<org.springframework.boot.cli.compiler.ExpressionStatement> < ExpressionStatement > java.util.ArrayList<org.springframework.boot.cli.compiler.ExpressionStatement> = new java.util.ArrayList<org.springframework.boot.cli.compiler.ExpressionStatement> <> ( ) ; for ( Statement org.springframework.boot.cli.compiler.Statement : org.springframework.boot.cli.compiler.BlockStatement . getStatements ( ) ) { if ( org.springframework.boot.cli.compiler.Statement instanceof ExpressionStatement ) { java.util.ArrayList<org.springframework.boot.cli.compiler.ExpressionStatement> . add ( ( ExpressionStatement ) org.springframework.boot.cli.compiler.Statement ) ; } } return java.util.ArrayList<org.springframework.boot.cli.compiler.ExpressionStatement> ; }  <METHOD_END>
<METHOD_START> private static org.springframework.boot.cli.compiler.ClosureExpression org.springframework.boot.cli.compiler.ClosureExpression ( java.lang.String java.lang.String , MethodCallExpression org.springframework.boot.cli.compiler.MethodCallExpression ) { Expression org.springframework.boot.cli.compiler.Expression = org.springframework.boot.cli.compiler.MethodCallExpression . getMethod ( ) ; if ( org.springframework.boot.cli.compiler.Expression instanceof ConstantExpression ) { if ( java.lang.String . boolean ( ( ( ConstantExpression ) org.springframework.boot.cli.compiler.Expression ) . getValue ( ) ) ) { return ( ClosureExpression ) ( ( ArgumentListExpression ) org.springframework.boot.cli.compiler.MethodCallExpression . getArguments ( ) ) . getExpression ( NUMBER ) ; } } return null ; }  <METHOD_END>
<METHOD_START> public static org.springframework.boot.cli.compiler.ClosureExpression org.springframework.boot.cli.compiler.ClosureExpression ( BlockStatement org.springframework.boot.cli.compiler.BlockStatement , java.lang.String java.lang.String ) { return org.springframework.boot.cli.compiler.ClosureExpression ( org.springframework.boot.cli.compiler.BlockStatement , java.lang.String , false ) ; }  <METHOD_END>