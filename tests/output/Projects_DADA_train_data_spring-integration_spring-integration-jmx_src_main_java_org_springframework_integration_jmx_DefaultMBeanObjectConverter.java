<METHOD_START> public void ( ) { this( new DefaultMBeanAttributeFilter ( ) ); }  <METHOD_END>
<METHOD_START> public void ( MBeanAttributeFilter org.springframework.integration.jmx.MBeanAttributeFilter ) { this . org.springframework.integration.jmx.MBeanAttributeFilter = org.springframework.integration.jmx.MBeanAttributeFilter ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.Object java.lang.Object ( javax.management.MBeanServerConnection javax.management.MBeanServerConnection , javax.management.ObjectInstance javax.management.ObjectInstance ) { java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > java.util.Map<java.lang.String,java.lang.Object> = new java.util.HashMap<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > ( ) ; try { javax.management.ObjectName javax.management.ObjectName = javax.management.ObjectInstance . javax.management.ObjectName ( ) ; if ( ! javax.management.MBeanServerConnection . boolean ( javax.management.ObjectName ) ) { return java.util.Map<java.lang.String,java.lang.Object> ; } javax.management.MBeanInfo javax.management.MBeanInfo = javax.management.MBeanServerConnection . javax.management.MBeanInfo ( javax.management.ObjectName ) ; javax.management.MBeanAttributeInfo [] javax.management.MBeanAttributeInfo[] = javax.management.MBeanInfo . javax.management.MBeanAttributeInfo[] ( ) ; for ( javax.management.MBeanAttributeInfo javax.management.MBeanAttributeInfo : javax.management.MBeanAttributeInfo[] ) { if ( STRING . boolean ( javax.management.MBeanAttributeInfo . java.lang.String ( ) ) || ! this . org.springframework.integration.jmx.MBeanAttributeFilter . accept ( javax.management.ObjectName , javax.management.MBeanAttributeInfo . java.lang.String ( ) ) ) { continue; } java.lang.Object java.lang.Object ; try { java.lang.Object = javax.management.MBeanServerConnection . java.lang.Object ( javax.management.ObjectName , javax.management.MBeanAttributeInfo . java.lang.String ( ) ) ; } catch ( javax.management.RuntimeMBeanException javax.management.RuntimeMBeanException ) { if ( org.springframework.integration.jmx.Log . isTraceEnabled ( ) ) { org.springframework.integration.jmx.Log . trace ( STRING + javax.management.MBeanAttributeInfo . java.lang.String ( ) + STRING + javax.management.ObjectName + STRING , javax.management.RuntimeMBeanException ) ; } java.lang.Throwable java.lang.Throwable = javax.management.RuntimeMBeanException ; while ( java.lang.Throwable . java.lang.Throwable ( ) != null ) { java.lang.Throwable = java.lang.Throwable . java.lang.Throwable ( ) ; } java.lang.Object = java.lang.String . java.lang.String ( STRING , java.lang.Throwable . java.lang.Class<? extends java.lang.Throwable> ( ) . java.lang.String ( ) , java.lang.Throwable . java.lang.String ( ) ) ; } java.util.Map<java.lang.String,java.lang.Object> . java.lang.Object ( javax.management.MBeanAttributeInfo . java.lang.String ( ) , java.lang.Object ( java.lang.Object ) ) ; } } catch ( java.lang.Exception java.lang.Exception ) { throw new java.lang.IllegalArgumentException ( java.lang.Exception ) ; } return java.util.Map<java.lang.String,java.lang.Object> ; }  <METHOD_END>
<METHOD_START> private java.lang.Object java.lang.Object ( java.lang.Object java.lang.Object ) { if ( java.lang.Object == null ) { return java.lang.Object ; } else if ( java.lang.Object . java.lang.Class<? extends java.lang.Object> ( ) . boolean ( ) ) { if ( javax.management.openmbean.CompositeData .class . boolean ( java.lang.Object . java.lang.Class<? extends java.lang.Object> ( ) . java.lang.Class<?> ( ) ) ) { java.util.List<java.lang.Object> < java.lang.Object > java.util.List<java.lang.Object> = new java.util.ArrayList<java.lang.Object> < java.lang.Object > ( ) ; int int = java.lang.reflect.Array . int ( java.lang.Object ) ; for ( int int = NUMBER ; int < int ; int ++ ) { java.lang.Object java.lang.Object = java.lang.Object ( java.lang.reflect.Array . java.lang.Object ( java.lang.Object , int ) ) ; java.util.List<java.lang.Object> . boolean ( java.lang.Object ) ; } return java.util.List<java.lang.Object> ; } if ( javax.management.openmbean.TabularData .class . boolean ( java.lang.Object . java.lang.Class<? extends java.lang.Object> ( ) . java.lang.Class<?> ( ) ) ) { org.springframework.integration.jmx.Log . warn ( STRING + java.lang.Object . java.lang.String ( ) ) ; } } else if ( java.lang.Object instanceof javax.management.openmbean.CompositeData ) { javax.management.openmbean.CompositeData javax.management.openmbean.CompositeData = ( javax.management.openmbean.CompositeData ) java.lang.Object ; if ( javax.management.openmbean.CompositeData . javax.management.openmbean.CompositeType ( ) . boolean ( ) ) { org.springframework.integration.jmx.Log . warn ( STRING + java.lang.Object . java.lang.String ( ) ) ; } else { java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > java.util.Map<java.lang.String,java.lang.Object> = new java.util.HashMap<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > ( ) ; java.util.Set<java.lang.String> < java.lang.String > java.util.Set<java.lang.String> = javax.management.openmbean.CompositeData . javax.management.openmbean.CompositeType ( ) . java.util.Set<java.lang.String> ( ) ; for ( java.lang.String java.lang.String : java.util.Set<java.lang.String> ) { if ( STRING . boolean ( java.lang.String ) ) { continue; } java.lang.Object java.lang.Object = java.lang.Object ( javax.management.openmbean.CompositeData . java.lang.Object ( java.lang.String ) ) ; java.util.Map<java.lang.String,java.lang.Object> . java.lang.Object ( java.lang.String , java.lang.Object ) ; } return java.util.Map<java.lang.String,java.lang.Object> ; } } else if ( java.lang.Object instanceof javax.management.openmbean.TabularData ) { javax.management.openmbean.TabularData javax.management.openmbean.TabularData = ( javax.management.openmbean.TabularData ) java.lang.Object ; if ( javax.management.openmbean.TabularData . javax.management.openmbean.TabularType ( ) . boolean ( ) ) { org.springframework.integration.jmx.Log . warn ( STRING + java.lang.Object . java.lang.String ( ) ) ; } else { java.util.Map<java.lang.Object,java.lang.Object> < java.lang.Object , java.lang.Object > java.util.Map<java.lang.Object,java.lang.Object> = new java.util.HashMap<java.lang.Object,java.lang.Object> < java.lang.Object , java.lang.Object > ( ) ; @ java.lang.SuppressWarnings ( STRING ) java.util.Set<java.util.List<?>> < java.util.List<?> < ? > > java.util.Set<java.util.List<?>> = ( java.util.Set<java.util.List<?>> < java.util.List<?> < ? > > ) javax.management.openmbean.TabularData . java.util.Set<?> ( ) ; for ( java.util.List<?> < ? > java.util.List<?> : java.util.Set<java.util.List<?>> ) { javax.management.openmbean.CompositeData javax.management.openmbean.CompositeData = javax.management.openmbean.TabularData . javax.management.openmbean.CompositeData ( java.util.List<> . java.lang.Object[] ( ) ) ; java.lang.Object java.lang.Object = java.lang.Object ( javax.management.openmbean.CompositeData ) ; if ( java.util.List<> . int ( ) == NUMBER && ( java.lang.Object instanceof java.util.Map ) && ( ( java.util.Map<?,?> < ? , ? > ) java.lang.Object ) . int ( ) == NUMBER ) { java.lang.Object java.lang.Object = java.util.List<> . get ( NUMBER ) ; java.util.Map<?,?> < ? , ? > java.util.Map<?,?> = ( java.util.Map<?,?> < ? , ? > ) java.lang.Object ; if ( java.util.Map<,> . boolean ( STRING ) && java.util.Map<,> . boolean ( STRING ) && java.lang.Object . boolean ( java.util.Map<,> . get ( STRING ) ) ) { java.util.Map<java.lang.Object,java.lang.Object> . java.lang.Object ( java.util.Map<,> . get ( STRING ) , java.util.Map<,> . get ( STRING ) ) ; } else { java.util.Map<java.lang.Object,java.lang.Object> . java.lang.Object ( java.lang.Object , java.lang.Object ) ; } } else { java.util.Map<java.lang.Object,java.lang.Object> . java.lang.Object ( java.util.List<> , java.lang.Object ) ; } } return java.util.Map<java.lang.Object,java.lang.Object> ; } } return java.lang.Object ; }  <METHOD_END>