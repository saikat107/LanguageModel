<METHOD_START> @ Test public void void ( ) java.lang.Exception { DummyEntityManagerFactoryBean org.springframework.orm.jpa.DummyEntityManagerFactoryBean = new DummyEntityManagerFactoryBean ( mockEmf ) ; org.springframework.orm.jpa.DummyEntityManagerFactoryBean . afterPropertiesSet ( ) ; checkInvariants ( org.springframework.orm.jpa.DummyEntityManagerFactoryBean ) ; org.springframework.orm.jpa.DummyEntityManagerFactoryBean . destroy ( ) ; verify ( mockEmf ) . close ( ) ; }  <METHOD_END>
