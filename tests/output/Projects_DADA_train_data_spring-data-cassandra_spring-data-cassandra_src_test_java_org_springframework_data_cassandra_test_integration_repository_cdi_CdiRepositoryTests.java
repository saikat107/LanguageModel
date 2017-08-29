<METHOD_START> @ BeforeClass public static void void ( ) java.lang.Exception { org.springframework.data.cassandra.test.integration.repository.cdi.CdiTestContainer = CdiTestContainerLoader . getCdiContainer ( ) ; org.springframework.data.cassandra.test.integration.repository.cdi.CdiTestContainer . startApplicationScope ( ) ; org.springframework.data.cassandra.test.integration.repository.cdi.CdiTestContainer . startContexts ( ) ; org.springframework.data.cassandra.test.integration.repository.cdi.CdiTestContainer . bootContainer ( ) ; }  <METHOD_END>
<METHOD_START> @ AfterClass public static void void ( ) java.lang.Exception { org.springframework.data.cassandra.test.integration.repository.cdi.CdiTestContainer . stopContexts ( ) ; org.springframework.data.cassandra.test.integration.repository.cdi.CdiTestContainer . shutdownContainer ( ) ; }  <METHOD_END>
<METHOD_START> @ Before public void void ( ) { CdiRepositoryClient org.springframework.data.cassandra.test.integration.repository.cdi.CdiRepositoryClient = org.springframework.data.cassandra.test.integration.repository.cdi.CdiTestContainer . getInstance ( CdiRepositoryClient .class ) ; org.springframework.data.cassandra.test.integration.repository.cdi.CdiUserRepository = org.springframework.data.cassandra.test.integration.repository.cdi.CdiRepositoryClient . getRepository ( ) ; org.springframework.data.cassandra.test.integration.repository.cdi.SamplePersonRepository = org.springframework.data.cassandra.test.integration.repository.cdi.CdiRepositoryClient . getSamplePersonRepository ( ) ; org.springframework.data.cassandra.test.integration.repository.cdi.QualifiedUserRepository = org.springframework.data.cassandra.test.integration.repository.cdi.CdiRepositoryClient . getQualifiedUserRepository ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { assertThat ( org.springframework.data.cassandra.test.integration.repository.cdi.CdiUserRepository ) . isNotNull ( ) ; org.springframework.data.cassandra.test.integration.repository.cdi.CdiUserRepository . deleteAll ( ) ; User org.springframework.data.cassandra.test.integration.repository.cdi.User = new User ( ) ; org.springframework.data.cassandra.test.integration.repository.cdi.User . setUsername ( STRING ) ; org.springframework.data.cassandra.test.integration.repository.cdi.User . setFirstName ( STRING ) ; org.springframework.data.cassandra.test.integration.repository.cdi.User . setLastName ( STRING ) ; org.springframework.data.cassandra.test.integration.repository.cdi.CdiUserRepository . save ( org.springframework.data.cassandra.test.integration.repository.cdi.User ) ; assertThat ( org.springframework.data.cassandra.test.integration.repository.cdi.CdiUserRepository . exists ( org.springframework.data.cassandra.test.integration.repository.cdi.User . getUsername ( ) ) ) . isTrue ( ) ; java.util.Optional<org.springframework.data.cassandra.test.integration.repository.cdi.User> < User > java.util.Optional<org.springframework.data.cassandra.test.integration.repository.cdi.User> = org.springframework.data.cassandra.test.integration.repository.cdi.CdiUserRepository . findOne ( org.springframework.data.cassandra.test.integration.repository.cdi.User . getUsername ( ) ) ; assertThat ( java.util.Optional<org.springframework.data.cassandra.test.integration.repository.cdi.User> ) . hasValueSatisfying ( actual -> { assertThat ( actual . getUsername ( ) ) . isEqualTo ( bean . getUsername ( ) ) ; assertThat ( actual . getFirstName ( ) ) . isEqualTo ( bean . getFirstName ( ) ) ; assertThat ( actual . getLastName ( ) ) . isEqualTo ( bean . getLastName ( ) ) ; } ) ; assertThat ( org.springframework.data.cassandra.test.integration.repository.cdi.CdiUserRepository . count ( ) ) . isEqualTo ( NUMBER ) ; assertThat ( org.springframework.data.cassandra.test.integration.repository.cdi.CdiUserRepository . exists ( org.springframework.data.cassandra.test.integration.repository.cdi.User . getUsername ( ) ) ) . isTrue ( ) ; org.springframework.data.cassandra.test.integration.repository.cdi.CdiUserRepository . delete ( org.springframework.data.cassandra.test.integration.repository.cdi.User ) ; assertThat ( org.springframework.data.cassandra.test.integration.repository.cdi.CdiUserRepository . count ( ) ) . isEqualTo ( NUMBER ) ; assertThat ( org.springframework.data.cassandra.test.integration.repository.cdi.CdiUserRepository . findOne ( org.springframework.data.cassandra.test.integration.repository.cdi.User . getUsername ( ) ) ) . isNotPresent ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { assertThat ( org.springframework.data.cassandra.test.integration.repository.cdi.QualifiedUserRepository ) . isNotNull ( ) ; org.springframework.data.cassandra.test.integration.repository.cdi.QualifiedUserRepository . deleteAll ( ) ; User org.springframework.data.cassandra.test.integration.repository.cdi.User = new User ( ) ; org.springframework.data.cassandra.test.integration.repository.cdi.User . setUsername ( STRING ) ; org.springframework.data.cassandra.test.integration.repository.cdi.User . setFirstName ( STRING ) ; org.springframework.data.cassandra.test.integration.repository.cdi.User . setLastName ( STRING ) ; org.springframework.data.cassandra.test.integration.repository.cdi.QualifiedUserRepository . save ( org.springframework.data.cassandra.test.integration.repository.cdi.User ) ; assertThat ( org.springframework.data.cassandra.test.integration.repository.cdi.QualifiedUserRepository . exists ( org.springframework.data.cassandra.test.integration.repository.cdi.User . getUsername ( ) ) ) . isTrue ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { assertThat ( org.springframework.data.cassandra.test.integration.repository.cdi.SamplePersonRepository . returnOne ( ) ) . isEqualTo ( NUMBER ) ; }  <METHOD_END>
