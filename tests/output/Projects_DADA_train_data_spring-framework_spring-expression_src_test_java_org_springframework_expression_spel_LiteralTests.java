<METHOD_START> @ Test public void void ( ) { evaluate ( STRING , STRING , java.lang.Boolean .class ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { evaluate ( STRING , STRING , java.lang.Boolean .class ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { evaluate ( STRING , STRING , java.lang.Integer .class ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { evaluate ( STRING , STRING , java.lang.Integer .class ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { evaluate ( STRING , STRING , java.lang.String .class ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { evaluate ( STRING , STRING , java.lang.String .class ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { evaluate ( STRING , STRING , java.lang.String .class ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { evaluate ( STRING , STRING , java.lang.String .class ) ; evaluate ( STRING , STRING , java.lang.String .class ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { evaluate ( STRING , STRING , java.lang.String .class ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { evaluate ( STRING , STRING , java.lang.String .class ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { evaluate ( STRING , STRING , java.lang.Integer .class ) ; evaluate ( STRING , NUMBER , java.lang.Long .class ) ; evaluate ( STRING , STRING , java.lang.Integer .class ) ; evaluate ( STRING , NUMBER , java.lang.Long .class ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { evaluate ( STRING , NUMBER , java.lang.Long .class ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { evaluate ( STRING , NUMBER , java.lang.Long .class ) ; evaluateAndAskForReturnType ( STRING , NUMBER , java.lang.Integer .class ) ; evaluateAndCheckError ( STRING , java.lang.Integer .class , SpelMessage . TYPE_CONVERSION_ERROR , NUMBER ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { evaluate ( STRING , - NUMBER , java.lang.Integer .class ) ; evaluate ( STRING , - NUMBER , java.lang.Integer .class ) ; evaluate ( STRING , - NUMBER , java.lang.Long .class ) ; evaluate ( STRING , - NUMBER , java.lang.Long .class ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { evaluate ( STRING , NUMBER , java.lang.Double .class ) ; evaluate ( STRING , NUMBER , java.lang.Double .class ) ; evaluate ( STRING , - NUMBER , java.lang.Double .class ) ; evaluate ( STRING , NUMBER , java.lang.Double .class ) ; evaluate ( STRING , NUMBER , java.lang.Double .class ) ; evaluate ( STRING , - NUMBER , java.lang.Double .class ) ; evaluate ( STRING , NUMBER , java.lang.Double .class ) ; evaluate ( STRING , NUMBER , java.lang.Double .class ) ; evaluate ( STRING , - NUMBER , java.lang.Double .class ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { evaluate ( STRING , NUMBER , java.lang.Float .class ) ; evaluate ( STRING , NUMBER , java.lang.Float .class ) ; evaluate ( STRING , - NUMBER , java.lang.Float .class ) ; evaluate ( STRING , NUMBER , java.lang.Float .class ) ; evaluate ( STRING , NUMBER , java.lang.Float .class ) ; evaluate ( STRING , - NUMBER , java.lang.Float .class ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { evaluate ( STRING , STRING , java.lang.Double .class ) ; evaluate ( STRING , STRING , java.lang.Double .class ) ; evaluate ( STRING , STRING , java.lang.Double .class ) ; evaluate ( STRING , STRING , java.lang.Double .class ) ; evaluate ( STRING , NUMBER , java.lang.Float .class ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { parseAndCheckError ( STRING , SpelMessage . MORE_INPUT , NUMBER , STRING ) ; parseAndCheckError ( STRING , SpelMessage . MORE_INPUT , NUMBER , STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { evaluate ( STRING , null , null ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { evaluate ( STRING , ( byte ) NUMBER , java.lang.Byte .class ) ; evaluateAndAskForReturnType ( STRING , ( byte ) NUMBER , java.lang.Byte .class ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { SpelExpression org.springframework.expression.spel.SpelExpression = ( SpelExpression ) parser . parseExpression ( STRING ) ; assertFalse ( org.springframework.expression.spel.SpelExpression . isWritable ( new StandardEvaluationContext ( ) ) ) ; org.springframework.expression.spel.SpelExpression = ( SpelExpression ) parser . parseExpression ( STRING ) ; assertFalse ( org.springframework.expression.spel.SpelExpression . isWritable ( new StandardEvaluationContext ( ) ) ) ; org.springframework.expression.spel.SpelExpression = ( SpelExpression ) parser . parseExpression ( STRING ) ; assertFalse ( org.springframework.expression.spel.SpelExpression . isWritable ( new StandardEvaluationContext ( ) ) ) ; }  <METHOD_END>
