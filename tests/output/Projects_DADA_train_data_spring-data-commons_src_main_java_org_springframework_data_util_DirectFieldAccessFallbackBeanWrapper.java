<METHOD_START> public void ( java.lang.Object java.lang.Object ) { super( java.lang.Object ); }  <METHOD_END>
<METHOD_START> public void ( java.lang.Class<?> < ? > java.lang.Class<?> ) { super( java.lang.Class<> ); }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.Object java.lang.Object ( java.lang.String java.lang.String ) { try { return super. getPropertyValue ( java.lang.String ) ; } catch ( NotReadablePropertyException org.springframework.data.util.NotReadablePropertyException ) { java.lang.reflect.Field java.lang.reflect.Field = findField ( getWrappedClass ( ) , java.lang.String ) ; if ( java.lang.reflect.Field == null ) { throw new NotReadablePropertyException ( getWrappedClass ( ) , java.lang.String , STRING ) ; } makeAccessible ( java.lang.reflect.Field ) ; return getField ( java.lang.reflect.Field , getWrappedInstance ( ) ) ; } }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( java.lang.String java.lang.String , java.lang.Object java.lang.Object ) { try { super. setPropertyValue ( java.lang.String , java.lang.Object ) ; } catch ( NotWritablePropertyException org.springframework.data.util.NotWritablePropertyException ) { java.lang.reflect.Field java.lang.reflect.Field = findField ( getWrappedClass ( ) , java.lang.String ) ; if ( java.lang.reflect.Field == null ) { throw new NotWritablePropertyException ( getWrappedClass ( ) , java.lang.String , STRING , org.springframework.data.util.NotWritablePropertyException ) ; } makeAccessible ( java.lang.reflect.Field ) ; setField ( java.lang.reflect.Field , getWrappedInstance ( ) , java.lang.Object ) ; } }  <METHOD_END>
