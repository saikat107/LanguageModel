<METHOD_START> @ java.lang.Override @ java.lang.SuppressWarnings ( STRING ) public org.springframework.orm.jpa.vendor.EntityManagerFactory org.springframework.orm.jpa.vendor.EntityManagerFactory ( PersistenceUnitInfo org.springframework.orm.jpa.vendor.PersistenceUnitInfo , java.util.Map java.util.Map ) { final java.util.List<java.lang.String> < java.lang.String > java.util.List<java.lang.String> = new java.util.ArrayList <> ( org.springframework.orm.jpa.vendor.PersistenceUnitInfo . getManagedClassNames ( ) ) ; if ( org.springframework.orm.jpa.vendor.PersistenceUnitInfo instanceof SmartPersistenceUnitInfo ) { java.util.List<java.lang.String> . boolean ( ( ( SmartPersistenceUnitInfo ) org.springframework.orm.jpa.vendor.PersistenceUnitInfo ) . getManagedPackages ( ) ) ; } return new EntityManagerFactoryBuilderImpl ( new PersistenceUnitInfoDescriptor ( org.springframework.orm.jpa.vendor.PersistenceUnitInfo ) { @ java.lang.Override public java.util.List<java.lang.String> < java.lang.String > java.util.List<java.lang.String> ( ) { return java.util.List<java.lang.String> ; } } , java.util.Map ) . build ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.util.List<java.lang.String> < java.lang.String > java.util.List<java.lang.String> ( ) { return java.util.List<java.lang.String> ; }  <METHOD_END>