<METHOD_START> public static org.springframework.expression.spel.StandardEvaluationContext org.springframework.expression.spel.StandardEvaluationContext ( ) { StandardEvaluationContext org.springframework.expression.spel.StandardEvaluationContext = new StandardEvaluationContext ( ) ; void ( org.springframework.expression.spel.StandardEvaluationContext ) ; void ( org.springframework.expression.spel.StandardEvaluationContext ) ; void ( org.springframework.expression.spel.StandardEvaluationContext ) ; return org.springframework.expression.spel.StandardEvaluationContext ; }  <METHOD_END>
<METHOD_START> private static void void ( StandardEvaluationContext org.springframework.expression.spel.StandardEvaluationContext ) { try { org.springframework.expression.spel.StandardEvaluationContext . registerFunction ( STRING , org.springframework.expression.spel.TestScenarioCreator .class . java.lang.reflect.Method ( STRING , java.lang.Integer . java.lang.Class<java.lang.Integer> ) ) ; org.springframework.expression.spel.StandardEvaluationContext . registerFunction ( STRING , org.springframework.expression.spel.TestScenarioCreator .class . java.lang.reflect.Method ( STRING , java.lang.Integer . java.lang.Class<java.lang.Integer> , java.lang.Integer . java.lang.Class<java.lang.Integer> , java.lang.Integer . java.lang.Class<java.lang.Integer> ) ) ; org.springframework.expression.spel.StandardEvaluationContext . registerFunction ( STRING , org.springframework.expression.spel.TestScenarioCreator .class . java.lang.reflect.Method ( STRING , java.lang.String .class ) ) ; org.springframework.expression.spel.StandardEvaluationContext . registerFunction ( STRING , org.springframework.expression.spel.TestScenarioCreator .class . java.lang.reflect.Method ( STRING , java.lang.String [] .class ) ) ; org.springframework.expression.spel.StandardEvaluationContext . registerFunction ( STRING , org.springframework.expression.spel.TestScenarioCreator .class . java.lang.reflect.Method ( STRING , java.lang.Integer . java.lang.Class<java.lang.Integer> , java.lang.String [] .class ) ) ; } catch ( java.lang.Exception java.lang.Exception ) { throw new java.lang.IllegalStateException ( java.lang.Exception ) ; } }  <METHOD_END>
<METHOD_START> private static void void ( StandardEvaluationContext org.springframework.expression.spel.StandardEvaluationContext ) { org.springframework.expression.spel.StandardEvaluationContext . setVariable ( STRING , NUMBER ) ; }  <METHOD_END>
<METHOD_START> private static void void ( StandardEvaluationContext org.springframework.expression.spel.StandardEvaluationContext ) { java.util.GregorianCalendar java.util.GregorianCalendar = new java.util.GregorianCalendar ( ) ; java.util.GregorianCalendar . void ( NUMBER , NUMBER , NUMBER ) ; Inventor org.springframework.expression.spel.Inventor = new Inventor ( STRING , java.util.GregorianCalendar . java.util.Date ( ) , STRING ) ; org.springframework.expression.spel.Inventor . setPlaceOfBirth ( new PlaceOfBirth ( STRING ) ) ; org.springframework.expression.spel.Inventor . setInventions ( new java.lang.String [] { STRING , STRING , STRING , STRING , STRING , STRING , STRING , STRING , STRING } ) ; org.springframework.expression.spel.StandardEvaluationContext . setRootObject ( org.springframework.expression.spel.Inventor ) ; }  <METHOD_END>
<METHOD_START> public static java.lang.String java.lang.String ( int int ) { if ( ( int % NUMBER ) == NUMBER ) { return STRING ; } return STRING ; }  <METHOD_END>
<METHOD_START> public static int [] int[] ( int int , int int , int int ) { return new int [] { int , int , int } ; }  <METHOD_END>
<METHOD_START> public static java.lang.String java.lang.String ( java.lang.String java.lang.String ) { java.lang.StringBuilder java.lang.StringBuilder = new java.lang.StringBuilder ( ) ; for ( int int = NUMBER ; int < java.lang.String . int ( ) ; int ++ ) { java.lang.StringBuilder . java.lang.StringBuilder ( java.lang.String . char ( java.lang.String . int ( ) - NUMBER - int ) ) ; } return java.lang.StringBuilder . java.lang.String ( ) ; }  <METHOD_END>
<METHOD_START> public static java.lang.String java.lang.String ( java.lang.String ... java.lang.String[] ) { java.lang.StringBuilder java.lang.StringBuilder = new java.lang.StringBuilder ( ) ; if ( java.lang.String[] != null ) { for ( int int = java.lang.String[] . int - NUMBER ; int >= NUMBER ; int -- ) { java.lang.StringBuilder . java.lang.StringBuilder ( java.lang.String[] [ int ] ) ; } } return java.lang.StringBuilder . java.lang.String ( ) ; }  <METHOD_END>
<METHOD_START> public static java.lang.String java.lang.String ( int int , java.lang.String ... java.lang.String[] ) { java.lang.StringBuilder java.lang.StringBuilder = new java.lang.StringBuilder ( ) ; java.lang.StringBuilder . java.lang.StringBuilder ( int ) ; if ( java.lang.String[] != null ) { for ( int int = java.lang.String[] . int - NUMBER ; int >= NUMBER ; int -- ) { java.lang.StringBuilder . java.lang.StringBuilder ( java.lang.String[] [ int ] ) ; } } return java.lang.StringBuilder . java.lang.String ( ) ; }  <METHOD_END>