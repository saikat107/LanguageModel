<METHOD_START> public void ( LdapQueryMethod org.springframework.data.ldap.repository.query.LdapQueryMethod , java.lang.Class<?> < ? > java.lang.Class<?> , LdapOperations org.springframework.data.ldap.repository.query.LdapOperations ) { super( org.springframework.data.ldap.repository.query.LdapQueryMethod , java.lang.Class<> , org.springframework.data.ldap.repository.query.LdapOperations ); org.springframework.data.ldap.repository.query.PartTree = new PartTree ( org.springframework.data.ldap.repository.query.LdapQueryMethod . getName ( ) , java.lang.Class<> ) ; org.springframework.data.ldap.repository.query.Parameters<?,?> = org.springframework.data.ldap.repository.query.LdapQueryMethod . getParameters ( ) ; org.springframework.data.ldap.repository.query.ObjectDirectoryMapper = org.springframework.data.ldap.repository.query.LdapOperations . getObjectDirectoryMapper ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected org.springframework.data.ldap.repository.query.LdapQuery org.springframework.data.ldap.repository.query.LdapQuery ( java.lang.Object [] java.lang.Object[] ) { org . springframework . data . ldap . repository . query . org.springframework.data.ldap.repository.query.LdapQueryCreator org.springframework.data.ldap.repository.query.LdapQueryCreator = new LdapQueryCreator ( org.springframework.data.ldap.repository.query.PartTree , this . org.springframework.data.ldap.repository.query.Parameters<,> , getEntityClass ( ) , org.springframework.data.ldap.repository.query.ObjectDirectoryMapper , java.lang.Object[] ) ; return org.springframework.data.ldap.repository.query.LdapQueryCreator . createQuery ( ) ; }  <METHOD_END>
