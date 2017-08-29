<METHOD_START> @ Before public void void ( ) { org.springframework.integration.json.StandardEvaluationContext . addPropertyAccessor ( new JsonPropertyAccessor ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { java.lang.Object java.lang.Object = org.springframework.integration.json.ObjectMapper . readTree ( STRING ) ; java.lang.Object java.lang.Object = java.lang.Object ( java.lang.Object , STRING , java.lang.Object .class ) ; assertThat ( java.lang.Object , Matchers . instanceOf ( JsonPropertyAccessor . JsonPropertyAccessor .class ) ) ; assertEquals ( STRING , java.lang.Object . java.lang.String ( ) ) ; java.lang.Object java.lang.Object = org.springframework.integration.json.ObjectMapper . readTree ( STRING ) ; java.lang.Object java.lang.Object = java.lang.Object ( java.lang.Object , STRING , java.lang.Object .class ) ; assertThat ( java.lang.Object , Matchers . instanceOf ( JsonPropertyAccessor . JsonPropertyAccessor .class ) ) ; assertTrue ( java.lang.Object . boolean ( java.lang.Object ) ) ; assertEquals ( java.lang.Object . int ( ) , java.lang.Object . int ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test ( expected = SpelEvaluationException .class ) public void void ( ) java.lang.Exception { java.lang.Object java.lang.Object = org.springframework.integration.json.ObjectMapper . readTree ( STRING ) ; java.lang.Object ( java.lang.Object , STRING , java.lang.Object .class ) ; }  <METHOD_END>
<METHOD_START> @ Test ( expected = SpelEvaluationException .class ) public void void ( ) java.lang.Exception { java.lang.Object java.lang.Object = org.springframework.integration.json.ObjectMapper . readTree ( STRING ) ; java.lang.Object ( java.lang.Object , STRING , java.lang.Object .class ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { ArrayNode org.springframework.integration.json.ArrayNode = ( ArrayNode ) org.springframework.integration.json.ObjectMapper . readTree ( STRING ) ; java.lang.Object java.lang.Object = java.lang.Object ( JsonPropertyAccessor . wrap ( org.springframework.integration.json.ArrayNode ) , STRING , java.lang.Object .class ) ; assertEquals ( STRING , java.lang.Object . java.lang.String ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { JsonNode org.springframework.integration.json.JsonNode = org.springframework.integration.json.ObjectMapper . readTree ( STRING ) ; assertNull ( java.lang.Object ( org.springframework.integration.json.JsonNode , STRING , java.lang.Object .class ) ) ; }  <METHOD_END>
<METHOD_START> @ Test ( expected = SpelEvaluationException .class ) public void void ( ) java.lang.Exception { JsonNode org.springframework.integration.json.JsonNode = org.springframework.integration.json.ObjectMapper . readTree ( STRING ) ; java.lang.Object ( org.springframework.integration.json.JsonNode , STRING , java.lang.Object .class ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { java.lang.Object java.lang.Object = org.springframework.integration.json.ObjectMapper . readTree ( STRING ) ; java.lang.Object java.lang.Object = java.lang.Object ( java.lang.Object , STRING , java.lang.Object .class ) ; assertEquals ( STRING , java.lang.Object . java.lang.String ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { ArrayNode org.springframework.integration.json.ArrayNode = ( ArrayNode ) org.springframework.integration.json.ObjectMapper . readTree ( STRING ) ; java.lang.Object java.lang.Object = java.lang.Object ( JsonPropertyAccessor . wrap ( org.springframework.integration.json.ArrayNode ) , STRING , java.lang.Object .class ) ; assertEquals ( STRING , java.lang.Object . java.lang.String ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { java.lang.Object java.lang.Object = org.springframework.integration.json.ObjectMapper . readTree ( STRING ) ; java.lang.Object java.lang.Object = java.lang.Object ( java.lang.Object , STRING , java.lang.Object .class ) ; assertEquals ( STRING , java.lang.Object . java.lang.String ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { java.lang.Object java.lang.Object = org.springframework.integration.json.ObjectMapper . readTree ( STRING ) ; java.util.List<?> < ? > java.util.List<?> = java.util.List ( java.lang.Object , STRING , java.util.List .class ) ; assertEquals ( STRING , NUMBER , java.util.List<> . int ( ) ) ; assertEquals ( STRING , STRING , java.lang.Object ( java.util.List<> , STRING , java.lang.Object .class ) . java.lang.String ( ) ) ; assertEquals ( STRING , STRING , java.lang.Object ( java.util.List<> , STRING , java.lang.Object .class ) . java.lang.String ( ) ) ; assertEquals ( STRING , STRING , java.lang.Object ( java.util.List<> , STRING , java.lang.Object .class ) . java.lang.String ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { java.lang.Object java.lang.Object = org.springframework.integration.json.ObjectMapper . readTree ( STRING ) ; java.util.List<?> < ? > java.util.List<?> = java.util.List ( java.lang.Object , STRING , java.util.List .class ) ; assertEquals ( NUMBER , java.util.List<> . int ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { java.lang.Object java.lang.Object = org.springframework.integration.json.ObjectMapper . readTree ( STRING ) ; java.lang.Object java.lang.Object = java.lang.Object ( java.lang.Object , STRING , java.lang.Object .class ) ; assertEquals ( STRING , java.lang.Object . java.lang.String ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { java.lang.String java.lang.String = STRING ; java.lang.Object java.lang.Object = java.lang.Object ( java.lang.String , STRING , java.lang.Object .class ) ; assertEquals ( STRING , java.lang.Object . java.lang.String ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test ( expected = SpelEvaluationException .class ) public void void ( ) java.lang.Exception { java.lang.String java.lang.String = STRING ; java.lang.Object ( java.lang.String , STRING , java.lang.Object .class ) ; }  <METHOD_END>
<METHOD_START> @ Test ( expected = SpelEvaluationException .class ) public void void ( ) java.lang.Exception { java.lang.String java.lang.String = STRING ; java.lang.Object ( java.lang.String , STRING , java.lang.Object .class ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { Expression org.springframework.integration.json.Expression = org.springframework.integration.json.SpelExpressionParser . parseExpression ( STRING ) ; java.lang.Object java.lang.Object = org.springframework.integration.json.ObjectMapper . readTree ( STRING ) ; java.lang.Object java.lang.Object = org.springframework.integration.json.Expression . getValue ( this . org.springframework.integration.json.StandardEvaluationContext , java.lang.Object ) ; assertThat ( java.lang.Object , Matchers . instanceOf ( JsonPropertyAccessor . JsonPropertyAccessor .class ) ) ; assertEquals ( STRING , java.lang.Object . java.lang.String ( ) ) ; java.lang.Object java.lang.Object = org.springframework.integration.json.ObjectMapper . readTree ( STRING ) ; java.lang.Object java.lang.Object = org.springframework.integration.json.Expression . getValue ( this . org.springframework.integration.json.StandardEvaluationContext , java.lang.Object ) ; assertNull ( java.lang.Object ) ; }  <METHOD_END>
<METHOD_START> private < T > T T ( java.lang.Object java.lang.Object , java.lang.String java.lang.String , java.lang.Class<T> < T > java.lang.Class<T> ) { return org.springframework.integration.json.SpelExpressionParser . parseExpression ( java.lang.String ) . getValue ( org.springframework.integration.json.StandardEvaluationContext , java.lang.Object , java.lang.Class<T> ) ; }  <METHOD_END>
