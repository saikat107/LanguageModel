<METHOD_START> public void ( ) { this . org.springframework.expression.spel.standard.SpelParserConfiguration = new SpelParserConfiguration ( ) ; }  <METHOD_END>
<METHOD_START> public void ( SpelParserConfiguration org.springframework.expression.spel.standard.SpelParserConfiguration ) { Assert . notNull ( org.springframework.expression.spel.standard.SpelParserConfiguration , STRING ) ; this . org.springframework.expression.spel.standard.SpelParserConfiguration = org.springframework.expression.spel.standard.SpelParserConfiguration ; }  <METHOD_END>
<METHOD_START> public org.springframework.expression.spel.standard.SpelExpression org.springframework.expression.spel.standard.SpelExpression ( java.lang.String java.lang.String ) throws org.springframework.expression.spel.standard.ParseException { return org.springframework.expression.spel.standard.SpelExpression ( java.lang.String , null ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected org.springframework.expression.spel.standard.SpelExpression org.springframework.expression.spel.standard.SpelExpression ( java.lang.String java.lang.String , ParserContext org.springframework.expression.spel.standard.ParserContext ) throws org.springframework.expression.spel.standard.ParseException { return new InternalSpelExpressionParser ( this . org.springframework.expression.spel.standard.SpelParserConfiguration ) . doParseExpression ( java.lang.String , org.springframework.expression.spel.standard.ParserContext ) ; }  <METHOD_END>
