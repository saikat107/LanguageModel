<METHOD_START> @ Before public void void ( ) { this . org.springframework.data.neo4j.examples.jsr303.MockMvc = MockMvcBuilders . webAppContextSetup ( this . org.springframework.data.neo4j.examples.jsr303.WebApplicationContext ) . build ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { Adult org.springframework.data.neo4j.examples.jsr303.Adult = new Adult ( STRING , NUMBER ) ; java.lang.String java.lang.String = org.springframework.data.neo4j.examples.jsr303.ObjectMapper . writeValueAsString ( org.springframework.data.neo4j.examples.jsr303.Adult ) ; org.springframework.data.neo4j.examples.jsr303.MockMvc . perform ( post ( STRING ) . contentType ( MediaType . APPLICATION_JSON ) . content ( java.lang.String ) ) . andExpect ( status ( ) . isOk ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { Adult org.springframework.data.neo4j.examples.jsr303.Adult = new Adult ( STRING , NUMBER ) ; java.lang.String java.lang.String = org.springframework.data.neo4j.examples.jsr303.ObjectMapper . writeValueAsString ( org.springframework.data.neo4j.examples.jsr303.Adult ) ; org.springframework.data.neo4j.examples.jsr303.MockMvc . perform ( post ( STRING ) . contentType ( MediaType . APPLICATION_JSON ) . content ( java.lang.String ) ) . andExpect ( status ( ) . isBadRequest ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { Adult org.springframework.data.neo4j.examples.jsr303.Adult = new Adult ( null , NUMBER ) ; java.lang.String java.lang.String = org.springframework.data.neo4j.examples.jsr303.ObjectMapper . writeValueAsString ( org.springframework.data.neo4j.examples.jsr303.Adult ) ; org.springframework.data.neo4j.examples.jsr303.MockMvc . perform ( post ( STRING ) . contentType ( MediaType . APPLICATION_JSON ) . content ( java.lang.String ) ) . andExpect ( status ( ) . isBadRequest ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { Adult org.springframework.data.neo4j.examples.jsr303.Adult = new Adult ( STRING , NUMBER ) ; java.lang.String java.lang.String = org.springframework.data.neo4j.examples.jsr303.ObjectMapper . writeValueAsString ( org.springframework.data.neo4j.examples.jsr303.Adult ) ; org.springframework.data.neo4j.examples.jsr303.MockMvc . perform ( post ( STRING ) . contentType ( MediaType . APPLICATION_JSON ) . content ( java.lang.String ) ) . andExpect ( status ( ) . isBadRequest ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Bean public org.springframework.data.neo4j.examples.jsr303.PlatformTransactionManager org.springframework.data.neo4j.examples.jsr303.PlatformTransactionManager ( ) { return new Neo4jTransactionManager ( org.springframework.data.neo4j.examples.jsr303.SessionFactory ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Bean public org.springframework.data.neo4j.examples.jsr303.SessionFactory org.springframework.data.neo4j.examples.jsr303.SessionFactory ( ) { return new SessionFactory ( getBaseConfiguration ( ) . build ( ) , STRING ) ; }  <METHOD_END>
