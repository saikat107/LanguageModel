<METHOD_START> @ Test public void void ( ) java.lang.Exception { java.beans.PropertyEditor java.beans.PropertyEditor = new FileEditor ( ) ; java.beans.PropertyEditor . void ( STRING + ClassUtils . classPackageAsResourcePath ( java.lang.Class<? extends org.springframework.beans.propertyeditors.FileEditorTests> ( ) ) + STRING + ClassUtils . getShortName ( java.lang.Class<? extends org.springframework.beans.propertyeditors.FileEditorTests> ( ) ) + STRING ) ; java.lang.Object java.lang.Object = java.beans.PropertyEditor . java.lang.Object ( ) ; assertTrue ( java.lang.Object instanceof java.io.File ) ; java.io.File java.io.File = ( java.io.File ) java.lang.Object ; assertTrue ( java.io.File . boolean ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test ( expected = java.lang.IllegalArgumentException .class ) public void void ( ) java.lang.Exception { java.beans.PropertyEditor java.beans.PropertyEditor = new FileEditor ( ) ; java.beans.PropertyEditor . void ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { java.beans.PropertyEditor java.beans.PropertyEditor = new FileEditor ( ) ; java.beans.PropertyEditor . void ( STRING ) ; java.lang.Object java.lang.Object = java.beans.PropertyEditor . java.lang.Object ( ) ; assertTrue ( java.lang.Object instanceof java.io.File ) ; java.io.File java.io.File = ( java.io.File ) java.lang.Object ; assertTrue ( ! java.io.File . boolean ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { java.beans.PropertyEditor java.beans.PropertyEditor = new FileEditor ( ) ; java.beans.PropertyEditor . void ( STRING ) ; java.lang.Object java.lang.Object = java.beans.PropertyEditor . java.lang.Object ( ) ; assertTrue ( java.lang.Object instanceof java.io.File ) ; java.io.File java.io.File = ( java.io.File ) java.lang.Object ; assertTrue ( ! java.io.File . boolean ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { java.beans.PropertyEditor java.beans.PropertyEditor = new FileEditor ( ) ; java.lang.String java.lang.String = ClassUtils . classPackageAsResourcePath ( java.lang.Class<? extends org.springframework.beans.propertyeditors.FileEditorTests> ( ) ) + STRING + ClassUtils . getShortName ( java.lang.Class<? extends org.springframework.beans.propertyeditors.FileEditorTests> ( ) ) + STRING ; java.beans.PropertyEditor . void ( java.lang.String ) ; java.lang.Object java.lang.Object = java.beans.PropertyEditor . java.lang.Object ( ) ; assertTrue ( java.lang.Object instanceof java.io.File ) ; java.io.File java.io.File = ( java.io.File ) java.lang.Object ; assertTrue ( java.io.File . boolean ( ) ) ; java.lang.String java.lang.String = java.io.File . java.lang.String ( ) . java.lang.String ( '\\' , '/' ) ; assertTrue ( java.lang.String . boolean ( java.lang.String ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { java.beans.PropertyEditor java.beans.PropertyEditor = new FileEditor ( ) ; java.lang.String java.lang.String = ClassUtils . classPackageAsResourcePath ( java.lang.Class<? extends org.springframework.beans.propertyeditors.FileEditorTests> ( ) ) + STRING + ClassUtils . getShortName ( java.lang.Class<? extends org.springframework.beans.propertyeditors.FileEditorTests> ( ) ) + STRING ; java.beans.PropertyEditor . void ( java.lang.String ) ; java.lang.Object java.lang.Object = java.beans.PropertyEditor . java.lang.Object ( ) ; assertTrue ( java.lang.Object instanceof java.io.File ) ; java.io.File java.io.File = ( java.io.File ) java.lang.Object ; assertFalse ( java.io.File . boolean ( ) ) ; java.lang.String java.lang.String = java.io.File . java.lang.String ( ) . java.lang.String ( '\\' , '/' ) ; assertTrue ( java.lang.String . boolean ( java.lang.String ) ) ; }  <METHOD_END>