<METHOD_START> @ Test public void void ( ) { CustomAbstractPersistable org.springframework.data.jpa.repository.CustomAbstractPersistable = new CustomAbstractPersistable ( ) ; CustomAbstractPersistable org.springframework.data.jpa.repository.CustomAbstractPersistable = org.springframework.data.jpa.repository.CustomAbstractPersistableRepository . save ( org.springframework.data.jpa.repository.CustomAbstractPersistable ) ; CustomAbstractPersistable org.springframework.data.jpa.repository.CustomAbstractPersistable = org.springframework.data.jpa.repository.CustomAbstractPersistableRepository . findOne ( org.springframework.data.jpa.repository.CustomAbstractPersistable . getId ( ) ) . get ( ) ; assertThat ( org.springframework.data.jpa.repository.CustomAbstractPersistable , is ( org.springframework.data.jpa.repository.CustomAbstractPersistable ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { CustomAbstractPersistable org.springframework.data.jpa.repository.CustomAbstractPersistable = org.springframework.data.jpa.repository.CustomAbstractPersistableRepository . saveAndFlush ( new CustomAbstractPersistable ( ) ) ; org.springframework.data.jpa.repository.EntityManager . clear ( ) ; CustomAbstractPersistable org.springframework.data.jpa.repository.CustomAbstractPersistable = org.springframework.data.jpa.repository.CustomAbstractPersistableRepository . getOne ( org.springframework.data.jpa.repository.CustomAbstractPersistable . getId ( ) ) ; assertThat ( org.springframework.data.jpa.repository.CustomAbstractPersistable , is ( org.springframework.data.jpa.repository.CustomAbstractPersistable ) ) ; }  <METHOD_END>