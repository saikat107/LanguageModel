<METHOD_START> public void ( MongoPersistentEntityIndexCreator org.springframework.data.mongodb.core.index.MongoPersistentEntityIndexCreator ) { Assert . notNull ( org.springframework.data.mongodb.core.index.MongoPersistentEntityIndexCreator , STRING ) ; this . org.springframework.data.mongodb.core.index.MongoPersistentEntityIndexCreator = org.springframework.data.mongodb.core.index.MongoPersistentEntityIndexCreator ; }  <METHOD_END>
<METHOD_START> @ java.lang.SuppressWarnings ( STRING ) public void void ( ApplicationEvent org.springframework.data.mongodb.core.index.ApplicationEvent ) { if ( org.springframework.data.mongodb.core.index.ApplicationEvent instanceof MappingContextEvent ) { org.springframework.data.mongodb.core.index.MongoPersistentEntityIndexCreator . onApplicationEvent ( ( MappingContextEvent < MongoPersistentEntity < ? > , MongoPersistentProperty > ) org.springframework.data.mongodb.core.index.ApplicationEvent ) ; } }  <METHOD_END>
<METHOD_START> public void void ( java.lang.Object java.lang.Object ) {}  <METHOD_END>
