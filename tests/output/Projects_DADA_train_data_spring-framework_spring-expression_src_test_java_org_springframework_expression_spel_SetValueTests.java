<METHOD_START> @ Test public void void ( ) { void ( STRING , true ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { void ( STRING , STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { void ( STRING , STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { void ( STRING , null ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { void ( STRING , SpelMessage . CANNOT_INDEX_INTO_NULL_VALUE ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { void ( STRING , NUMBER ) ; void ( STRING , NUMBER ) ; void ( STRING , false ) ; void ( STRING , NUMBER ) ; void ( STRING , ( short ) NUMBER ) ; void ( STRING , NUMBER ) ; void ( STRING , ( byte ) NUMBER ) ; void ( STRING , ( char ) NUMBER ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { Expression org.springframework.expression.spel.Expression = null ; StandardEvaluationContext org.springframework.expression.spel.StandardEvaluationContext = TestScenarioCreator . getTestEvaluationContext ( ) ; org.springframework.expression.spel.Expression = parser . parseExpression ( STRING ) ; assertFalse ( STRING , org.springframework.expression.spel.Expression . isWritable ( org.springframework.expression.spel.StandardEvaluationContext ) ) ; org.springframework.expression.spel.Expression = parser . parseExpression ( STRING ) ; try { assertFalse ( STRING , org.springframework.expression.spel.Expression . isWritable ( org.springframework.expression.spel.StandardEvaluationContext ) ) ; fail ( STRING ) ; } catch ( SpelEvaluationException org.springframework.expression.spel.SpelEvaluationException ) { } org.springframework.expression.spel.Expression = parser . parseExpression ( STRING ) ; assertTrue ( STRING , org.springframework.expression.spel.Expression . isWritable ( org.springframework.expression.spel.StandardEvaluationContext ) ) ; org.springframework.expression.spel.Expression = parser . parseExpression ( STRING ) ; assertFalse ( STRING , org.springframework.expression.spel.Expression . isWritable ( org.springframework.expression.spel.StandardEvaluationContext ) ) ; org.springframework.expression.spel.Expression = parser . parseExpression ( STRING ) ; try { assertFalse ( STRING , org.springframework.expression.spel.Expression . isWritable ( org.springframework.expression.spel.StandardEvaluationContext ) ) ; fail ( STRING ) ; } catch ( SpelEvaluationException org.springframework.expression.spel.SpelEvaluationException ) { } org.springframework.expression.spel.Expression = parser . parseExpression ( STRING ) ; try { assertFalse ( STRING , org.springframework.expression.spel.Expression . isWritable ( org.springframework.expression.spel.StandardEvaluationContext ) ) ; fail ( STRING ) ; } catch ( SpelEvaluationException org.springframework.expression.spel.SpelEvaluationException ) { } }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { void ( STRING , STRING ) ; void ( STRING , STRING ) ; void ( STRING , STRING ) ; void ( STRING , STRING ) ; void ( STRING , STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { void ( STRING , STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { void ( STRING , new PlaceOfBirth ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { void ( STRING , STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { void ( STRING , STRING , java.lang.Boolean . java.lang.Boolean ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { void ( STRING , STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { void ( STRING , STRING ) ; void ( STRING , STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { void ( STRING , STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { void ( STRING , 'p' ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { void ( STRING , STRING , java.lang.Boolean . java.lang.Boolean ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { void ( STRING , STRING , java.lang.Boolean . java.lang.Boolean ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { StandardEvaluationContext org.springframework.expression.spel.StandardEvaluationContext = TestScenarioCreator . getTestEvaluationContext ( ) ; Expression org.springframework.expression.spel.Expression = org.springframework.expression.spel.Expression ( STRING ) ; assertFalse ( org.springframework.expression.spel.Expression . isWritable ( org.springframework.expression.spel.StandardEvaluationContext ) ) ; assertEquals ( STRING , org.springframework.expression.spel.Expression . getValue ( org.springframework.expression.spel.StandardEvaluationContext ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { StandardEvaluationContext org.springframework.expression.spel.StandardEvaluationContext = TestScenarioCreator . getTestEvaluationContext ( ) ; Expression org.springframework.expression.spel.Expression = org.springframework.expression.spel.Expression ( STRING ) ; assertNull ( org.springframework.expression.spel.Expression . getValue ( org.springframework.expression.spel.StandardEvaluationContext ) ) ; org.springframework.expression.spel.Expression . setValue ( org.springframework.expression.spel.StandardEvaluationContext , STRING ) ; java.util.Set<?> < ? > java.util.Set<?> = org.springframework.expression.spel.Expression ( STRING ) . getValue ( org.springframework.expression.spel.StandardEvaluationContext , java.util.Set .class ) ; for ( java.lang.Object java.lang.Object : java.util.Set<> ) { assertEquals ( java.lang.String .class , java.lang.Object . java.lang.Class<? extends java.lang.Object> ( ) ) ; } java.util.Collection<?> < ? > java.util.Collection<?> = org.springframework.expression.spel.Expression ( STRING ) . getValue ( org.springframework.expression.spel.StandardEvaluationContext , java.util.Collection .class ) ; for ( java.lang.Object java.lang.Object : java.util.Collection<> ) { assertEquals ( java.lang.Boolean .class , java.lang.Object . java.lang.Class<? extends java.lang.Object> ( ) ) ; } java.lang.Object java.lang.Object = org.springframework.expression.spel.Expression . getValue ( org.springframework.expression.spel.StandardEvaluationContext ) ; assertEquals ( java.lang.Boolean . java.lang.Boolean , java.lang.Object ) ; }  <METHOD_END>
<METHOD_START> private org.springframework.expression.spel.Expression org.springframework.expression.spel.Expression ( java.lang.String java.lang.String ) throws java.lang.Exception { return parser . parseExpression ( java.lang.String ) ; }  <METHOD_END>
<METHOD_START> protected void void ( java.lang.String java.lang.String , java.lang.Object java.lang.Object ) { try { Expression org.springframework.expression.spel.Expression = parser . parseExpression ( java.lang.String ) ; if ( org.springframework.expression.spel.Expression == null ) { fail ( STRING ) ; } if ( boolean ) { SpelUtilities . printAbstractSyntaxTree ( java.lang.System . java.io.PrintStream , org.springframework.expression.spel.Expression ) ; } StandardEvaluationContext org.springframework.expression.spel.StandardEvaluationContext = TestScenarioCreator . getTestEvaluationContext ( ) ; org.springframework.expression.spel.Expression . setValue ( org.springframework.expression.spel.StandardEvaluationContext , java.lang.Object ) ; fail ( STRING ) ; } catch ( ParseException org.springframework.expression.spel.ParseException ) { org.springframework.expression.spel.ParseException . printStackTrace ( ) ; fail ( STRING + org.springframework.expression.spel.ParseException . getMessage ( ) ) ; } catch ( EvaluationException org.springframework.expression.spel.EvaluationException ) { } }  <METHOD_END>
<METHOD_START> protected void void ( java.lang.String java.lang.String , java.lang.Object java.lang.Object ) { try { Expression org.springframework.expression.spel.Expression = parser . parseExpression ( java.lang.String ) ; if ( org.springframework.expression.spel.Expression == null ) { fail ( STRING ) ; } if ( boolean ) { SpelUtilities . printAbstractSyntaxTree ( java.lang.System . java.io.PrintStream , org.springframework.expression.spel.Expression ) ; } StandardEvaluationContext org.springframework.expression.spel.StandardEvaluationContext = TestScenarioCreator . getTestEvaluationContext ( ) ; assertTrue ( STRING , org.springframework.expression.spel.Expression . isWritable ( org.springframework.expression.spel.StandardEvaluationContext ) ) ; org.springframework.expression.spel.Expression . setValue ( org.springframework.expression.spel.StandardEvaluationContext , java.lang.Object ) ; assertEquals ( STRING , java.lang.Object , org.springframework.expression.spel.Expression . getValue ( org.springframework.expression.spel.StandardEvaluationContext , java.lang.Object . java.lang.Class<? extends java.lang.Object> ( ) ) ) ; } catch ( EvaluationException org.springframework.expression.spel.EvaluationException ) { org.springframework.expression.spel.EvaluationException . printStackTrace ( ) ; fail ( STRING + org.springframework.expression.spel.EvaluationException . getMessage ( ) ) ; } catch ( ParseException org.springframework.expression.spel.ParseException ) { org.springframework.expression.spel.ParseException . printStackTrace ( ) ; fail ( STRING + org.springframework.expression.spel.ParseException . getMessage ( ) ) ; } }  <METHOD_END>
<METHOD_START> protected void void ( java.lang.String java.lang.String , java.lang.Object java.lang.Object , java.lang.Object java.lang.Object ) { try { Expression org.springframework.expression.spel.Expression = parser . parseExpression ( java.lang.String ) ; if ( org.springframework.expression.spel.Expression == null ) { fail ( STRING ) ; } if ( boolean ) { SpelUtilities . printAbstractSyntaxTree ( java.lang.System . java.io.PrintStream , org.springframework.expression.spel.Expression ) ; } StandardEvaluationContext org.springframework.expression.spel.StandardEvaluationContext = TestScenarioCreator . getTestEvaluationContext ( ) ; assertTrue ( STRING , org.springframework.expression.spel.Expression . isWritable ( org.springframework.expression.spel.StandardEvaluationContext ) ) ; org.springframework.expression.spel.Expression . setValue ( org.springframework.expression.spel.StandardEvaluationContext , java.lang.Object ) ; java.lang.Object java.lang.Object = java.lang.Object ; java.lang.Object java.lang.Object = org.springframework.expression.spel.Expression . getValue ( org.springframework.expression.spel.StandardEvaluationContext ) ; if ( ! java.lang.Object . boolean ( java.lang.Object ) ) { fail ( STRING + java.lang.Object + STRING + java.lang.Object . java.lang.Class<? extends java.lang.Object> ( ) + STRING + java.lang.Object + STRING + java.lang.Object . java.lang.Class<? extends java.lang.Object> ( ) ) ; } } catch ( EvaluationException org.springframework.expression.spel.EvaluationException ) { org.springframework.expression.spel.EvaluationException . printStackTrace ( ) ; fail ( STRING + org.springframework.expression.spel.EvaluationException . getMessage ( ) ) ; } catch ( ParseException org.springframework.expression.spel.ParseException ) { org.springframework.expression.spel.ParseException . printStackTrace ( ) ; fail ( STRING + org.springframework.expression.spel.ParseException . getMessage ( ) ) ; } }  <METHOD_END>