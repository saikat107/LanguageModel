<METHOD_START> @ java.lang.Override public void void ( Event org.springframework.data.neo4j.events.Event ) { this . org.springframework.data.neo4j.events.ApplicationEventPublisher . publishEvent ( new PreSaveEvent ( org.springframework.data.neo4j.events.Event ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( Event org.springframework.data.neo4j.events.Event ) { this . org.springframework.data.neo4j.events.ApplicationEventPublisher . publishEvent ( new PostSaveEvent ( org.springframework.data.neo4j.events.Event ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( Event org.springframework.data.neo4j.events.Event ) { this . org.springframework.data.neo4j.events.ApplicationEventPublisher . publishEvent ( new PreDeleteEvent ( org.springframework.data.neo4j.events.Event ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( Event org.springframework.data.neo4j.events.Event ) { this . org.springframework.data.neo4j.events.ApplicationEventPublisher . publishEvent ( new PostDeleteEvent ( org.springframework.data.neo4j.events.Event ) ) ; }  <METHOD_END>