<METHOD_START> @ Test @ java.lang.SuppressWarnings ( STRING ) public void void ( ) java.lang.Exception { assertTrue ( org.springframework.data.mongodb.config.ApplicationContext . containsBean ( STRING ) ) ; MongoClientFactoryBean org.springframework.data.mongodb.config.MongoClientFactoryBean = ( MongoClientFactoryBean ) org.springframework.data.mongodb.config.ApplicationContext . getBean ( STRING ) ; java.util.List<org.springframework.data.mongodb.config.ServerAddress> < ServerAddress > java.util.List<org.springframework.data.mongodb.config.ServerAddress> = ( java.util.List<org.springframework.data.mongodb.config.ServerAddress> < ServerAddress > ) ReflectionTestUtils . getField ( org.springframework.data.mongodb.config.MongoClientFactoryBean , STRING ) ; assertThat ( java.util.List<org.springframework.data.mongodb.config.ServerAddress> , is ( notNullValue ( ) ) ) ; assertThat ( java.util.List<org.springframework.data.mongodb.config.ServerAddress> , hasItems ( new ServerAddress ( java.net.InetAddress . java.net.InetAddress ( STRING ) , NUMBER ) , new ServerAddress ( java.net.InetAddress . java.net.InetAddress ( STRING ) , NUMBER ) ) ) ; }  <METHOD_END>
<METHOD_START> @ Test @ java.lang.SuppressWarnings ( STRING ) public void void ( ) java.lang.Exception { assertTrue ( org.springframework.data.mongodb.config.ApplicationContext . containsBean ( STRING ) ) ; MongoClientFactoryBean org.springframework.data.mongodb.config.MongoClientFactoryBean = ( MongoClientFactoryBean ) org.springframework.data.mongodb.config.ApplicationContext . getBean ( STRING ) ; java.util.List<org.springframework.data.mongodb.config.ServerAddress> < ServerAddress > java.util.List<org.springframework.data.mongodb.config.ServerAddress> = ( java.util.List<org.springframework.data.mongodb.config.ServerAddress> < ServerAddress > ) ReflectionTestUtils . getField ( org.springframework.data.mongodb.config.MongoClientFactoryBean , STRING ) ; assertThat ( java.util.List<org.springframework.data.mongodb.config.ServerAddress> , is ( notNullValue ( ) ) ) ; assertThat ( java.util.List<org.springframework.data.mongodb.config.ServerAddress> , hasSize ( NUMBER ) ) ; java.util.List<java.lang.Integer> < java.lang.Integer > java.util.List<java.lang.Integer> = new java.util.ArrayList<java.lang.Integer> < java.lang.Integer > ( ) ; for ( ServerAddress org.springframework.data.mongodb.config.ServerAddress : java.util.List<org.springframework.data.mongodb.config.ServerAddress> ) { java.util.List<java.lang.Integer> . boolean ( org.springframework.data.mongodb.config.ServerAddress . getPort ( ) ) ; } assertThat ( java.util.List<java.lang.Integer> , hasItems ( NUMBER , NUMBER , NUMBER ) ) ; }  <METHOD_END>
<METHOD_START> @ Test @ Ignore ( STRING ) public void void ( ) { MongoClient org.springframework.data.mongodb.config.MongoClient = org.springframework.data.mongodb.config.ApplicationContext . getBean ( MongoClient .class ) ; assertEquals ( NUMBER , org.springframework.data.mongodb.config.MongoClient . getAllAddress ( ) . size ( ) ) ; java.util.List<org.springframework.data.mongodb.config.ServerAddress> < ServerAddress > java.util.List<org.springframework.data.mongodb.config.ServerAddress> = org.springframework.data.mongodb.config.MongoClient . getAllAddress ( ) ; assertEquals ( STRING , java.util.List<org.springframework.data.mongodb.config.ServerAddress> . get ( NUMBER ) . getHost ( ) ) ; assertEquals ( STRING , java.util.List<org.springframework.data.mongodb.config.ServerAddress> . get ( NUMBER ) . getHost ( ) ) ; assertEquals ( NUMBER , java.util.List<org.springframework.data.mongodb.config.ServerAddress> . get ( NUMBER ) . getPort ( ) ) ; assertEquals ( NUMBER , java.util.List<org.springframework.data.mongodb.config.ServerAddress> . get ( NUMBER ) . getPort ( ) ) ; MongoTemplate org.springframework.data.mongodb.config.MongoTemplate = new MongoTemplate ( org.springframework.data.mongodb.config.MongoClient , STRING ) ; Document org.springframework.data.mongodb.config.Document = org.springframework.data.mongodb.config.MongoTemplate . executeCommand ( STRING ) ; assertEquals ( STRING , org.springframework.data.mongodb.config.Document . get ( STRING ) . toString ( ) ) ; }  <METHOD_END>
