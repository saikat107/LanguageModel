<METHOD_START> public void ( ) {	}  <METHOD_END>
<METHOD_START> public void ( java.lang.Class<T> < T > java.lang.Class<T> ) { void ( java.lang.Class<T> ) ; }  <METHOD_END>
<METHOD_START> public void ( java.lang.Class<T> < T > java.lang.Class<T> , boolean boolean ) { void ( java.lang.Class<T> ) ; this . boolean = boolean ; }  <METHOD_END>
<METHOD_START> public void void ( java.lang.Class<T> < T > java.lang.Class<T> ) { if ( this . java.lang.Class<T> == null ) { void ( java.lang.Class<T> ) ; } else { if ( this . java.lang.Class<T> != java.lang.Class<T> ) { throw new InvalidDataAccessApiUsageException ( STRING + java.lang.Class<T> + STRING + this . java.lang.Class<T> ) ; } } }  <METHOD_END>
<METHOD_START> public final java.lang.Class<T> < T > java.lang.Class<T> ( ) { return this . java.lang.Class<T> ; }  <METHOD_END>
<METHOD_START> public void void ( boolean boolean ) { this . boolean = boolean ; }  <METHOD_END>
<METHOD_START> public boolean boolean ( ) { return this . boolean ; }  <METHOD_END>
<METHOD_START> public void void ( boolean boolean ) { this . boolean = boolean ; }  <METHOD_END>
<METHOD_START> public boolean boolean ( ) { return this . boolean ; }  <METHOD_END>
<METHOD_START> public void void ( ConversionService org.springframework.jdbc.core.ConversionService ) { this . org.springframework.jdbc.core.ConversionService = org.springframework.jdbc.core.ConversionService ; }  <METHOD_END>
<METHOD_START> public org.springframework.jdbc.core.ConversionService org.springframework.jdbc.core.ConversionService ( ) { return this . org.springframework.jdbc.core.ConversionService ; }  <METHOD_END>
<METHOD_START> protected void void ( java.lang.Class<T> < T > java.lang.Class<T> ) { this . java.lang.Class<T> = java.lang.Class<T> ; this . java.util.Map<java.lang.String,java.beans.PropertyDescriptor> = new java.util.HashMap<java.lang.String,java.beans.PropertyDescriptor> <> ( ) ; this . java.util.Set<java.lang.String> = new java.util.HashSet<java.lang.String> <> ( ) ; java.beans.PropertyDescriptor [] java.beans.PropertyDescriptor[] = BeanUtils . getPropertyDescriptors ( java.lang.Class<T> ) ; for ( java.beans.PropertyDescriptor java.beans.PropertyDescriptor : java.beans.PropertyDescriptor[] ) { if ( java.beans.PropertyDescriptor . java.lang.reflect.Method ( ) != null ) { this . java.util.Map<java.lang.String,java.beans.PropertyDescriptor> . java.beans.PropertyDescriptor ( java.lang.String ( java.beans.PropertyDescriptor . java.lang.String ( ) ) , java.beans.PropertyDescriptor ) ; java.lang.String java.lang.String = java.lang.String ( java.beans.PropertyDescriptor . java.lang.String ( ) ) ; if ( ! java.lang.String ( java.beans.PropertyDescriptor . java.lang.String ( ) ) . boolean ( java.lang.String ) ) { this . java.util.Map<java.lang.String,java.beans.PropertyDescriptor> . java.beans.PropertyDescriptor ( java.lang.String , java.beans.PropertyDescriptor ) ; } this . java.util.Set<java.lang.String> . boolean ( java.beans.PropertyDescriptor . java.lang.String ( ) ) ; } } }  <METHOD_END>
<METHOD_START> protected java.lang.String java.lang.String ( java.lang.String java.lang.String ) { if ( ! StringUtils . hasLength ( java.lang.String ) ) { return STRING ; } java.lang.StringBuilder java.lang.StringBuilder = new java.lang.StringBuilder ( ) ; java.lang.StringBuilder . java.lang.StringBuilder ( java.lang.String ( java.lang.String . java.lang.String ( NUMBER , NUMBER ) ) ) ; for ( int int = NUMBER ; int < java.lang.String . int ( ) ; int ++ ) { java.lang.String java.lang.String = java.lang.String . java.lang.String ( int , int + NUMBER ) ; java.lang.String java.lang.String = java.lang.String ( java.lang.String ) ; if ( ! java.lang.String . boolean ( java.lang.String ) ) { java.lang.StringBuilder . java.lang.StringBuilder ( STRING ) . java.lang.StringBuilder ( java.lang.String ) ; } else { java.lang.StringBuilder . java.lang.StringBuilder ( java.lang.String ) ; } } return java.lang.StringBuilder . java.lang.String ( ) ; }  <METHOD_END>
<METHOD_START> protected java.lang.String java.lang.String ( java.lang.String java.lang.String ) { return java.lang.String . java.lang.String ( java.util.Locale . java.util.Locale ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public T T ( java.sql.ResultSet java.sql.ResultSet , int int ) throws java.sql.SQLException { Assert . state ( this . java.lang.Class<T> != null , STRING ) ; T T = BeanUtils . instantiateClass ( this . java.lang.Class<T> ) ; BeanWrapper org.springframework.jdbc.core.BeanWrapper = PropertyAccessorFactory . forBeanPropertyAccess ( T ) ; void ( org.springframework.jdbc.core.BeanWrapper ) ; java.sql.ResultSetMetaData java.sql.ResultSetMetaData = java.sql.ResultSet . java.sql.ResultSetMetaData ( ) ; int int = java.sql.ResultSetMetaData . int ( ) ; java.util.Set<java.lang.String> < java.lang.String > java.util.Set<java.lang.String> = ( boolean ( ) ? new java.util.HashSet<java.lang.String> <> ( ) : null ) ; for ( int int = NUMBER ; int <= int ; int ++ ) { java.lang.String java.lang.String = JdbcUtils . lookupColumnName ( java.sql.ResultSetMetaData , int ) ; java.lang.String java.lang.String = java.lang.String ( java.lang.String . java.lang.String ( STRING , STRING ) ) ; java.beans.PropertyDescriptor java.beans.PropertyDescriptor = this . java.util.Map<java.lang.String,java.beans.PropertyDescriptor> . java.beans.PropertyDescriptor ( java.lang.String ) ; if ( java.beans.PropertyDescriptor != null ) { try { java.lang.Object java.lang.Object = java.lang.Object ( java.sql.ResultSet , int , java.beans.PropertyDescriptor ) ; if ( int == NUMBER && org.springframework.jdbc.core.Log . isDebugEnabled ( ) ) { org.springframework.jdbc.core.Log . debug ( STRING + java.lang.String + STRING + java.beans.PropertyDescriptor . java.lang.String ( ) + STRING + ClassUtils . getQualifiedName ( java.beans.PropertyDescriptor . java.lang.Class<?> ( ) ) + STRING ) ; } try { org.springframework.jdbc.core.BeanWrapper . setPropertyValue ( java.beans.PropertyDescriptor . java.lang.String ( ) , java.lang.Object ) ; } catch ( TypeMismatchException org.springframework.jdbc.core.TypeMismatchException ) { if ( java.lang.Object == null && this . boolean ) { if ( org.springframework.jdbc.core.Log . isDebugEnabled ( ) ) { org.springframework.jdbc.core.Log . debug ( STRING + int + STRING + java.lang.String + STRING + java.beans.PropertyDescriptor . java.lang.String ( ) + STRING + ClassUtils . getQualifiedName ( java.beans.PropertyDescriptor . java.lang.Class<?> ( ) ) + STRING + T , org.springframework.jdbc.core.TypeMismatchException ) ; } } else { throw org.springframework.jdbc.core.TypeMismatchException ; } } if ( java.util.Set<java.lang.String> != null ) { java.util.Set<java.lang.String> . boolean ( java.beans.PropertyDescriptor . java.lang.String ( ) ) ; } } catch ( NotWritablePropertyException org.springframework.jdbc.core.NotWritablePropertyException ) { throw new DataRetrievalFailureException ( STRING + java.lang.String + STRING + java.beans.PropertyDescriptor . java.lang.String ( ) + STRING , org.springframework.jdbc.core.NotWritablePropertyException ) ; } } else { if ( int == NUMBER && org.springframework.jdbc.core.Log . isDebugEnabled ( ) ) { org.springframework.jdbc.core.Log . debug ( STRING + java.lang.String + STRING + java.lang.String + STRING ) ; } } } if ( java.util.Set<java.lang.String> != null && ! java.util.Set<java.lang.String> . boolean ( this . java.util.Set<java.lang.String> ) ) { throw new InvalidDataAccessApiUsageException ( STRING + STRING + this . java.lang.Class<T> . java.lang.String ( ) + STRING + this . java.util.Set<java.lang.String> ) ; } return T ; }  <METHOD_END>
<METHOD_START> protected void void ( BeanWrapper org.springframework.jdbc.core.BeanWrapper ) { ConversionService org.springframework.jdbc.core.ConversionService = org.springframework.jdbc.core.ConversionService ( ) ; if ( org.springframework.jdbc.core.ConversionService != null ) { org.springframework.jdbc.core.BeanWrapper . setConversionService ( org.springframework.jdbc.core.ConversionService ) ; } }  <METHOD_END>
<METHOD_START> protected java.lang.Object java.lang.Object ( java.sql.ResultSet java.sql.ResultSet , int int , java.beans.PropertyDescriptor java.beans.PropertyDescriptor ) throws java.sql.SQLException { return JdbcUtils . getResultSetValue ( java.sql.ResultSet , int , java.beans.PropertyDescriptor . java.lang.Class<?> ( ) ) ; }  <METHOD_END>
<METHOD_START> public static < T > org.springframework.jdbc.core.BeanPropertyRowMapper<T> < T > org.springframework.jdbc.core.BeanPropertyRowMapper<T> ( java.lang.Class<T> < T > java.lang.Class<T> ) { return new org.springframework.jdbc.core.BeanPropertyRowMapper<T> <> ( java.lang.Class<T> ) ; }  <METHOD_END>
