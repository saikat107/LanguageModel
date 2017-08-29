<METHOD_START> @ Before public void void ( ) { org.springframework.data.jpa.repository.support.JpaRepository<org.springframework.data.jpa.repository.support.SampleEntity,org.springframework.data.jpa.repository.support.SampleEntityPK> = new JpaRepositoryFactory ( org.springframework.data.jpa.repository.support.EntityManager ) . getRepository ( org.springframework.data.jpa.repository.support.JpaRepositoryTests.SampleEntityRepository .class ) ; org.springframework.data.jpa.repository.support.CrudRepository<org.springframework.data.jpa.repository.support.PersistableWithIdClass,org.springframework.data.jpa.repository.support.PersistableWithIdClassPK> = new JpaRepositoryFactory ( org.springframework.data.jpa.repository.support.EntityManager ) . getRepository ( org.springframework.data.jpa.repository.support.JpaRepositoryTests.SampleWithIdClassRepository .class ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { SampleEntity org.springframework.data.jpa.repository.support.SampleEntity = new SampleEntity ( STRING , STRING ) ; org.springframework.data.jpa.repository.support.JpaRepository<org.springframework.data.jpa.repository.support.SampleEntity,org.springframework.data.jpa.repository.support.SampleEntityPK> . saveAndFlush ( org.springframework.data.jpa.repository.support.SampleEntity ) ; assertThat ( org.springframework.data.jpa.repository.support.JpaRepository<org.springframework.data.jpa.repository.support.SampleEntity,org.springframework.data.jpa.repository.support.SampleEntityPK> . exists ( new SampleEntityPK ( STRING , STRING ) ) , is ( true ) ) ; assertThat ( org.springframework.data.jpa.repository.support.JpaRepository<org.springframework.data.jpa.repository.support.SampleEntity,org.springframework.data.jpa.repository.support.SampleEntityPK> . count ( ) , is ( NUMBER ) ) ; assertThat ( org.springframework.data.jpa.repository.support.JpaRepository<org.springframework.data.jpa.repository.support.SampleEntity,org.springframework.data.jpa.repository.support.SampleEntityPK> . findOne ( new SampleEntityPK ( STRING , STRING ) ) , is ( java.util.Optional . java.util.Optional ( org.springframework.data.jpa.repository.support.SampleEntity ) ) ) ; org.springframework.data.jpa.repository.support.JpaRepository<org.springframework.data.jpa.repository.support.SampleEntity,org.springframework.data.jpa.repository.support.SampleEntityPK> . delete ( java.util.Arrays . java.util.List ( org.springframework.data.jpa.repository.support.SampleEntity ) ) ; org.springframework.data.jpa.repository.support.JpaRepository<org.springframework.data.jpa.repository.support.SampleEntity,org.springframework.data.jpa.repository.support.SampleEntityPK> . flush ( ) ; assertThat ( org.springframework.data.jpa.repository.support.JpaRepository<org.springframework.data.jpa.repository.support.SampleEntity,org.springframework.data.jpa.repository.support.SampleEntityPK> . count ( ) , is ( NUMBER ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { PersistableWithIdClass org.springframework.data.jpa.repository.support.PersistableWithIdClass = new PersistableWithIdClass ( NUMBER , NUMBER ) ; org.springframework.data.jpa.repository.support.CrudRepository<org.springframework.data.jpa.repository.support.PersistableWithIdClass,org.springframework.data.jpa.repository.support.PersistableWithIdClassPK> . save ( org.springframework.data.jpa.repository.support.PersistableWithIdClass ) ; assertThat ( org.springframework.data.jpa.repository.support.PersistableWithIdClass . getFirst ( ) , is ( notNullValue ( ) ) ) ; assertThat ( org.springframework.data.jpa.repository.support.PersistableWithIdClass . getSecond ( ) , is ( notNullValue ( ) ) ) ; PersistableWithIdClassPK org.springframework.data.jpa.repository.support.PersistableWithIdClassPK = new PersistableWithIdClassPK ( org.springframework.data.jpa.repository.support.PersistableWithIdClass . getFirst ( ) , org.springframework.data.jpa.repository.support.PersistableWithIdClass . getSecond ( ) ) ; assertThat ( org.springframework.data.jpa.repository.support.CrudRepository<org.springframework.data.jpa.repository.support.PersistableWithIdClass,org.springframework.data.jpa.repository.support.PersistableWithIdClassPK> . findOne ( org.springframework.data.jpa.repository.support.PersistableWithIdClassPK ) , is ( java.util.Optional . java.util.Optional ( org.springframework.data.jpa.repository.support.PersistableWithIdClass ) ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { PersistableWithIdClass org.springframework.data.jpa.repository.support.PersistableWithIdClass = org.springframework.data.jpa.repository.support.CrudRepository<org.springframework.data.jpa.repository.support.PersistableWithIdClass,org.springframework.data.jpa.repository.support.PersistableWithIdClassPK> . save ( new PersistableWithIdClass ( NUMBER , NUMBER ) ) ; PersistableWithIdClass org.springframework.data.jpa.repository.support.PersistableWithIdClass = org.springframework.data.jpa.repository.support.CrudRepository<org.springframework.data.jpa.repository.support.PersistableWithIdClass,org.springframework.data.jpa.repository.support.PersistableWithIdClassPK> . save ( new PersistableWithIdClass ( NUMBER , NUMBER ) ) ; assertThat ( org.springframework.data.jpa.repository.support.CrudRepository<org.springframework.data.jpa.repository.support.PersistableWithIdClass,org.springframework.data.jpa.repository.support.PersistableWithIdClassPK> . exists ( org.springframework.data.jpa.repository.support.PersistableWithIdClass . getId ( ) ) , is ( true ) ) ; assertThat ( org.springframework.data.jpa.repository.support.CrudRepository<org.springframework.data.jpa.repository.support.PersistableWithIdClass,org.springframework.data.jpa.repository.support.PersistableWithIdClassPK> . exists ( org.springframework.data.jpa.repository.support.PersistableWithIdClass . getId ( ) ) , is ( true ) ) ; assertThat ( org.springframework.data.jpa.repository.support.CrudRepository<org.springframework.data.jpa.repository.support.PersistableWithIdClass,org.springframework.data.jpa.repository.support.PersistableWithIdClassPK> . exists ( new PersistableWithIdClassPK ( NUMBER , NUMBER ) ) , is ( false ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { PersistableWithIdClass org.springframework.data.jpa.repository.support.PersistableWithIdClass = new PersistableWithIdClass ( NUMBER , NUMBER ) ; org.springframework.data.jpa.repository.support.CrudRepository<org.springframework.data.jpa.repository.support.PersistableWithIdClass,org.springframework.data.jpa.repository.support.PersistableWithIdClassPK> . save ( org.springframework.data.jpa.repository.support.PersistableWithIdClass ) ; assertThat ( org.springframework.data.jpa.repository.support.PersistableWithIdClass . getFirst ( ) , is ( notNullValue ( ) ) ) ; assertThat ( org.springframework.data.jpa.repository.support.PersistableWithIdClass . getSecond ( ) , is ( notNullValue ( ) ) ) ; PersistableWithIdClassPK org.springframework.data.jpa.repository.support.PersistableWithIdClassPK = new PersistableWithIdClassPK ( org.springframework.data.jpa.repository.support.PersistableWithIdClass . getFirst ( ) , org.springframework.data.jpa.repository.support.PersistableWithIdClass . getSecond ( ) ) ; assertThat ( org.springframework.data.jpa.repository.support.CrudRepository<org.springframework.data.jpa.repository.support.PersistableWithIdClass,org.springframework.data.jpa.repository.support.PersistableWithIdClassPK> . exists ( org.springframework.data.jpa.repository.support.PersistableWithIdClassPK ) , is ( true ) ) ; }  <METHOD_END>
