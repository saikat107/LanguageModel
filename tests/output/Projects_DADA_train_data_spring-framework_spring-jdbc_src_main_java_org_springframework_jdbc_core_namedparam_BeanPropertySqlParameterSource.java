<METHOD_START> public void ( java.lang.Object java.lang.Object ) { this . org.springframework.jdbc.core.namedparam.BeanWrapper = PropertyAccessorFactory . forBeanPropertyAccess ( java.lang.Object ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public boolean boolean ( java.lang.String java.lang.String ) { return this . org.springframework.jdbc.core.namedparam.BeanWrapper . isReadableProperty ( java.lang.String ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.Object java.lang.Object ( java.lang.String java.lang.String ) throws java.lang.IllegalArgumentException { try { return this . org.springframework.jdbc.core.namedparam.BeanWrapper . getPropertyValue ( java.lang.String ) ; } catch ( NotReadablePropertyException org.springframework.jdbc.core.namedparam.NotReadablePropertyException ) { throw new java.lang.IllegalArgumentException ( org.springframework.jdbc.core.namedparam.NotReadablePropertyException . getMessage ( ) ) ; } }  <METHOD_END>
<METHOD_START> public java.lang.String [] java.lang.String[] ( ) { if ( this . java.lang.String[] == null ) { java.util.List<java.lang.String> < java.lang.String > java.util.List<java.lang.String> = new java.util.ArrayList<java.lang.String> <> ( ) ; java.beans.PropertyDescriptor [] java.beans.PropertyDescriptor[] = this . org.springframework.jdbc.core.namedparam.BeanWrapper . getPropertyDescriptors ( ) ; for ( java.beans.PropertyDescriptor java.beans.PropertyDescriptor : java.beans.PropertyDescriptor[] ) { if ( this . org.springframework.jdbc.core.namedparam.BeanWrapper . isReadableProperty ( java.beans.PropertyDescriptor . java.lang.String ( ) ) ) { java.util.List<java.lang.String> . boolean ( java.beans.PropertyDescriptor . java.lang.String ( ) ) ; } } this . java.lang.String[] = java.util.List<java.lang.String> . java.lang.String[] ( new java.lang.String [ java.util.List<java.lang.String> . int ( ) ] ) ; } return this . java.lang.String[] ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public int int ( java.lang.String java.lang.String ) { int int = super. getSqlType ( java.lang.String ) ; if ( int != TYPE_UNKNOWN ) { return int ; } java.lang.Class<?> < ? > java.lang.Class<?> = this . org.springframework.jdbc.core.namedparam.BeanWrapper . getPropertyType ( java.lang.String ) ; return StatementCreatorUtils . javaTypeToSqlParameterType ( java.lang.Class<> ) ; }  <METHOD_END>
