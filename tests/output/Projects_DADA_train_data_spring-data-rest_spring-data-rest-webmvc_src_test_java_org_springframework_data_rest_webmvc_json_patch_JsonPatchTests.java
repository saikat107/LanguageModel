<METHOD_START> @ Test public void void ( ) java.lang.Exception { java.util.List<org.springframework.data.rest.webmvc.json.patch.Todo> < Todo > java.util.List<org.springframework.data.rest.webmvc.json.patch.Todo> = new java.util.ArrayList<org.springframework.data.rest.webmvc.json.patch.Todo> < Todo > ( ) ; java.util.List<org.springframework.data.rest.webmvc.json.patch.Todo> . add ( new Todo ( NUMBER , STRING , true ) ) ; java.util.List<org.springframework.data.rest.webmvc.json.patch.Todo> . add ( new Todo ( NUMBER , STRING , false ) ) ; java.util.List<org.springframework.data.rest.webmvc.json.patch.Todo> . add ( new Todo ( NUMBER , STRING , false ) ) ; java.util.List<org.springframework.data.rest.webmvc.json.patch.Todo> . add ( new Todo ( NUMBER , STRING , false ) ) ; java.util.List<org.springframework.data.rest.webmvc.json.patch.Todo> . add ( new Todo ( NUMBER , STRING , false ) ) ; java.util.List<org.springframework.data.rest.webmvc.json.patch.Todo> . add ( new Todo ( NUMBER , STRING , false ) ) ; Patch org.springframework.data.rest.webmvc.json.patch.Patch = org.springframework.data.rest.webmvc.json.patch.Patch ( STRING ) ; assertEquals ( NUMBER , org.springframework.data.rest.webmvc.json.patch.Patch . size ( ) ) ; java.util.List<org.springframework.data.rest.webmvc.json.patch.Todo> < Todo > java.util.List<org.springframework.data.rest.webmvc.json.patch.Todo> = org.springframework.data.rest.webmvc.json.patch.Patch . apply ( java.util.List<org.springframework.data.rest.webmvc.json.patch.Todo> , Todo .class ) ; assertEquals ( NUMBER , java.util.List<org.springframework.data.rest.webmvc.json.patch.Todo> . size ( ) ) ; assertTrue ( java.util.List<org.springframework.data.rest.webmvc.json.patch.Todo> . get ( NUMBER ) . isComplete ( ) ) ; assertEquals ( STRING , java.util.List<org.springframework.data.rest.webmvc.json.patch.Todo> . get ( NUMBER ) . getDescription ( ) ) ; assertEquals ( STRING , java.util.List<org.springframework.data.rest.webmvc.json.patch.Todo> . get ( NUMBER ) . getDescription ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { java.util.List<org.springframework.data.rest.webmvc.json.patch.Todo> < Todo > java.util.List<org.springframework.data.rest.webmvc.json.patch.Todo> = new java.util.ArrayList<org.springframework.data.rest.webmvc.json.patch.Todo> < Todo > ( ) ; java.util.List<org.springframework.data.rest.webmvc.json.patch.Todo> . add ( new Todo ( NUMBER , STRING , true ) ) ; java.util.List<org.springframework.data.rest.webmvc.json.patch.Todo> . add ( new Todo ( NUMBER , STRING , false ) ) ; java.util.List<org.springframework.data.rest.webmvc.json.patch.Todo> . add ( new Todo ( NUMBER , STRING , false ) ) ; java.util.List<org.springframework.data.rest.webmvc.json.patch.Todo> . add ( new Todo ( NUMBER , STRING , false ) ) ; java.util.List<org.springframework.data.rest.webmvc.json.patch.Todo> . add ( new Todo ( NUMBER , STRING , false ) ) ; java.util.List<org.springframework.data.rest.webmvc.json.patch.Todo> . add ( new Todo ( NUMBER , STRING , false ) ) ; Patch org.springframework.data.rest.webmvc.json.patch.Patch = org.springframework.data.rest.webmvc.json.patch.Patch ( STRING ) ; try { org.springframework.data.rest.webmvc.json.patch.Patch . apply ( java.util.List<org.springframework.data.rest.webmvc.json.patch.Todo> , Todo .class ) ; fail ( ) ; } catch ( PatchException org.springframework.data.rest.webmvc.json.patch.PatchException ) { assertEquals ( STRING , org.springframework.data.rest.webmvc.json.patch.PatchException . getMessage ( ) ) ; } assertEquals ( NUMBER , java.util.List<org.springframework.data.rest.webmvc.json.patch.Todo> . size ( ) ) ; assertFalse ( java.util.List<org.springframework.data.rest.webmvc.json.patch.Todo> . get ( NUMBER ) . isComplete ( ) ) ; assertEquals ( STRING , java.util.List<org.springframework.data.rest.webmvc.json.patch.Todo> . get ( NUMBER ) . getDescription ( ) ) ; assertEquals ( STRING , java.util.List<org.springframework.data.rest.webmvc.json.patch.Todo> . get ( NUMBER ) . getDescription ( ) ) ; assertEquals ( STRING , java.util.List<org.springframework.data.rest.webmvc.json.patch.Todo> . get ( NUMBER ) . getDescription ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { java.util.List<org.springframework.data.rest.webmvc.json.patch.Todo> < Todo > java.util.List<org.springframework.data.rest.webmvc.json.patch.Todo> = new java.util.ArrayList<org.springframework.data.rest.webmvc.json.patch.Todo> < Todo > ( ) ; java.util.List<org.springframework.data.rest.webmvc.json.patch.Todo> . add ( new Todo ( NUMBER , STRING , true ) ) ; java.util.List<org.springframework.data.rest.webmvc.json.patch.Todo> . add ( new Todo ( NUMBER , STRING , false ) ) ; java.util.List<org.springframework.data.rest.webmvc.json.patch.Todo> . add ( new Todo ( NUMBER , STRING , false ) ) ; java.util.List<org.springframework.data.rest.webmvc.json.patch.Todo> . add ( new Todo ( NUMBER , STRING , false ) ) ; java.util.List<org.springframework.data.rest.webmvc.json.patch.Todo> . add ( new Todo ( NUMBER , STRING , false ) ) ; java.util.List<org.springframework.data.rest.webmvc.json.patch.Todo> . add ( new Todo ( NUMBER , STRING , false ) ) ; Patch org.springframework.data.rest.webmvc.json.patch.Patch = org.springframework.data.rest.webmvc.json.patch.Patch ( STRING ) ; try { org.springframework.data.rest.webmvc.json.patch.Patch . apply ( java.util.List<org.springframework.data.rest.webmvc.json.patch.Todo> , Todo .class ) ; fail ( ) ; } catch ( PatchException org.springframework.data.rest.webmvc.json.patch.PatchException ) { assertEquals ( STRING , org.springframework.data.rest.webmvc.json.patch.PatchException . getMessage ( ) ) ; } assertEquals ( NUMBER , java.util.List<org.springframework.data.rest.webmvc.json.patch.Todo> . size ( ) ) ; assertFalse ( java.util.List<org.springframework.data.rest.webmvc.json.patch.Todo> . get ( NUMBER ) . isComplete ( ) ) ; assertEquals ( STRING , java.util.List<org.springframework.data.rest.webmvc.json.patch.Todo> . get ( NUMBER ) . getDescription ( ) ) ; assertEquals ( STRING , java.util.List<org.springframework.data.rest.webmvc.json.patch.Todo> . get ( NUMBER ) . getDescription ( ) ) ; assertEquals ( STRING , java.util.List<org.springframework.data.rest.webmvc.json.patch.Todo> . get ( NUMBER ) . getDescription ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { Todo org.springframework.data.rest.webmvc.json.patch.Todo = new Todo ( NUMBER , STRING , false ) ; Patch org.springframework.data.rest.webmvc.json.patch.Patch = org.springframework.data.rest.webmvc.json.patch.Patch ( STRING ) ; assertEquals ( NUMBER , org.springframework.data.rest.webmvc.json.patch.Patch . size ( ) ) ; Todo org.springframework.data.rest.webmvc.json.patch.Todo = org.springframework.data.rest.webmvc.json.patch.Patch . apply ( org.springframework.data.rest.webmvc.json.patch.Todo , Todo .class ) ; assertEquals ( java.util.Arrays . java.util.List<java.lang.String> ( STRING , STRING , STRING ) , org.springframework.data.rest.webmvc.json.patch.Todo . getItems ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { Todo org.springframework.data.rest.webmvc.json.patch.Todo = new Todo ( ) ; org.springframework.data.rest.webmvc.json.patch.Todo . setAmount ( java.math.BigInteger . java.math.BigInteger ) ; org.springframework.data.rest.webmvc.json.patch.ExpectedException . expect ( PatchException .class ) ; org.springframework.data.rest.webmvc.json.patch.ExpectedException . expectMessage ( STRING ) ; org.springframework.data.rest.webmvc.json.patch.ExpectedException . expectMessage ( STRING ) ; org.springframework.data.rest.webmvc.json.patch.Patch ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { Todo org.springframework.data.rest.webmvc.json.patch.Todo = new Todo ( ) ; org.springframework.data.rest.webmvc.json.patch.Todo . setDescription ( STRING ) ; Patch org.springframework.data.rest.webmvc.json.patch.Patch = org.springframework.data.rest.webmvc.json.patch.Patch ( STRING ) ; org.springframework.data.rest.webmvc.json.patch.ExpectedException . expect ( PatchException .class ) ; org.springframework.data.rest.webmvc.json.patch.ExpectedException . expectMessage ( STRING ) ; org.springframework.data.rest.webmvc.json.patch.ExpectedException . expectMessage ( STRING ) ; org.springframework.data.rest.webmvc.json.patch.ExpectedException . expectMessage ( java.lang.String .class . java.lang.String ( ) ) ; org.springframework.data.rest.webmvc.json.patch.Patch . apply ( org.springframework.data.rest.webmvc.json.patch.Todo , Todo .class ) ; }  <METHOD_END>
<METHOD_START> private org.springframework.data.rest.webmvc.json.patch.Patch org.springframework.data.rest.webmvc.json.patch.Patch ( java.lang.String java.lang.String ) throws java.io.IOException , org.springframework.data.rest.webmvc.json.patch.JsonParseException , org.springframework.data.rest.webmvc.json.patch.JsonMappingException { ClassPathResource org.springframework.data.rest.webmvc.json.patch.ClassPathResource = new ClassPathResource ( java.lang.String , java.lang.Class<? extends org.springframework.data.rest.webmvc.json.patch.JsonPatchTests> ( ) ) ; JsonNode org.springframework.data.rest.webmvc.json.patch.JsonNode = new ObjectMapper ( ) . readValue ( org.springframework.data.rest.webmvc.json.patch.ClassPathResource . getInputStream ( ) , JsonNode .class ) ; Patch org.springframework.data.rest.webmvc.json.patch.Patch = new JsonPatchPatchConverter ( new ObjectMapper ( ) ) . convert ( org.springframework.data.rest.webmvc.json.patch.JsonNode ) ; return org.springframework.data.rest.webmvc.json.patch.Patch ; }  <METHOD_END>
