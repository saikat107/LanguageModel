<METHOD_START> @ Test public void void ( ) { TestPerson org.springframework.integration.json.TestPerson = new TestPerson ( STRING , STRING , NUMBER ) ; org.springframework.integration.json.TestPerson . setAddress ( new TestAddress ( NUMBER , STRING ) ) ; java.util.List<org.springframework.integration.json.TestPerson> < TestPerson > java.util.List<org.springframework.integration.json.TestPerson> = new java.util.ArrayList<org.springframework.integration.json.TestPerson> < TestPerson > ( ) ; java.util.List<org.springframework.integration.json.TestPerson> . add ( org.springframework.integration.json.TestPerson ) ; ObjectToJsonTransformer org.springframework.integration.json.ObjectToJsonTransformer = new ObjectToJsonTransformer ( ) ; Message < ? > org.springframework.integration.json.Message<?> = org.springframework.integration.json.ObjectToJsonTransformer . transform ( new GenericMessage < java.lang.Object > ( java.util.List<org.springframework.integration.json.TestPerson> ) ) ; JsonToObjectTransformer org.springframework.integration.json.JsonToObjectTransformer = new JsonToObjectTransformer ( ) ; java.lang.Object java.lang.Object = org.springframework.integration.json.JsonToObjectTransformer . transform ( org.springframework.integration.json.Message<> ) . getPayload ( ) ; assertThat ( java.lang.Object , Matchers . instanceOf ( java.util.List .class ) ) ; assertEquals ( org.springframework.integration.json.TestPerson , ( ( java.util.List<?> < ? > ) java.lang.Object ) . get ( NUMBER ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { TestPerson org.springframework.integration.json.TestPerson = new TestPerson ( STRING , STRING , NUMBER ) ; org.springframework.integration.json.TestPerson . setAddress ( new TestAddress ( NUMBER , STRING ) ) ; java.util.List<org.springframework.integration.json.TestPerson> < TestPerson > java.util.List<org.springframework.integration.json.TestPerson> = new java.util.ArrayList<org.springframework.integration.json.TestPerson> < TestPerson > ( ) ; java.util.List<org.springframework.integration.json.TestPerson> . add ( org.springframework.integration.json.TestPerson ) ; ObjectToJsonTransformer org.springframework.integration.json.ObjectToJsonTransformer = new ObjectToJsonTransformer ( new BoonJsonObjectMapper ( ) ) ; Message < ? > org.springframework.integration.json.Message<?> = org.springframework.integration.json.ObjectToJsonTransformer . transform ( new GenericMessage < java.lang.Object > ( java.util.List<org.springframework.integration.json.TestPerson> ) ) ; JsonToObjectTransformer org.springframework.integration.json.JsonToObjectTransformer = new JsonToObjectTransformer ( new BoonJsonObjectMapper ( ) ) ; java.lang.Object java.lang.Object = org.springframework.integration.json.JsonToObjectTransformer . transform ( org.springframework.integration.json.Message<> ) . getPayload ( ) ; assertThat ( java.lang.Object , Matchers . instanceOf ( java.util.List .class ) ) ; assertEquals ( org.springframework.integration.json.TestPerson , ( ( java.util.List<?> < ? > ) java.lang.Object ) . get ( NUMBER ) ) ; }  <METHOD_END>