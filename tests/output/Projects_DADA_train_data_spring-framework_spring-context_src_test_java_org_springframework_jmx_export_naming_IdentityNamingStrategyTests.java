<METHOD_START> @ Test public void void ( ) javax.management.MalformedObjectNameException { JmxTestBean org.springframework.jmx.export.naming.JmxTestBean = new JmxTestBean ( ) ; IdentityNamingStrategy org.springframework.jmx.export.naming.IdentityNamingStrategy = new IdentityNamingStrategy ( ) ; javax.management.ObjectName javax.management.ObjectName = org.springframework.jmx.export.naming.IdentityNamingStrategy . getObjectName ( org.springframework.jmx.export.naming.JmxTestBean , STRING ) ; assertEquals ( STRING , org.springframework.jmx.export.naming.JmxTestBean . getClass ( ) . getPackage ( ) . getName ( ) , javax.management.ObjectName . java.lang.String ( ) ) ; assertEquals ( STRING , ClassUtils . getShortName ( org.springframework.jmx.export.naming.JmxTestBean . getClass ( ) ) , javax.management.ObjectName . java.lang.String ( IdentityNamingStrategy . TYPE_KEY ) ) ; assertEquals ( STRING , ObjectUtils . getIdentityHexString ( org.springframework.jmx.export.naming.JmxTestBean ) , javax.management.ObjectName . java.lang.String ( IdentityNamingStrategy . HASH_CODE_KEY ) ) ; }  <METHOD_END>