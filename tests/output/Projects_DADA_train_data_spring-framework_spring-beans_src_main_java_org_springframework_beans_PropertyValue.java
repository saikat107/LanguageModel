<METHOD_START> public void ( java.lang.String java.lang.String , java.lang.Object java.lang.Object ) { this . java.lang.String = java.lang.String ; this . java.lang.Object = java.lang.Object ; }  <METHOD_END>
<METHOD_START> public void ( org.springframework.beans.PropertyValue org.springframework.beans.PropertyValue ) { Assert . notNull ( org.springframework.beans.PropertyValue , STRING ) ; this . java.lang.String = org.springframework.beans.PropertyValue . java.lang.String ( ) ; this . java.lang.Object = org.springframework.beans.PropertyValue . java.lang.Object ( ) ; this . boolean = org.springframework.beans.PropertyValue . boolean ( ) ; this . boolean = org.springframework.beans.PropertyValue . boolean ; this . java.lang.Object = org.springframework.beans.PropertyValue . java.lang.Object ; this . java.lang.Boolean = org.springframework.beans.PropertyValue . java.lang.Boolean ; this . java.lang.Object = org.springframework.beans.PropertyValue . java.lang.Object ; setSource ( org.springframework.beans.PropertyValue . getSource ( ) ) ; copyAttributesFrom ( org.springframework.beans.PropertyValue ) ; }  <METHOD_END>
<METHOD_START> public void ( org.springframework.beans.PropertyValue org.springframework.beans.PropertyValue , java.lang.Object java.lang.Object ) { Assert . notNull ( org.springframework.beans.PropertyValue , STRING ) ; this . java.lang.String = org.springframework.beans.PropertyValue . java.lang.String ( ) ; this . java.lang.Object = java.lang.Object ; this . boolean = org.springframework.beans.PropertyValue . boolean ( ) ; this . java.lang.Boolean = org.springframework.beans.PropertyValue . java.lang.Boolean ; this . java.lang.Object = org.springframework.beans.PropertyValue . java.lang.Object ; setSource ( org.springframework.beans.PropertyValue ) ; copyAttributesFrom ( org.springframework.beans.PropertyValue ) ; }  <METHOD_END>
<METHOD_START> public java.lang.String java.lang.String ( ) { return this . java.lang.String ; }  <METHOD_END>
<METHOD_START> public java.lang.Object java.lang.Object ( ) { return this . java.lang.Object ; }  <METHOD_END>
<METHOD_START> public org.springframework.beans.PropertyValue org.springframework.beans.PropertyValue ( ) { org.springframework.beans.PropertyValue org.springframework.beans.PropertyValue = this ; java.lang.Object java.lang.Object = getSource ( ) ; while ( java.lang.Object instanceof org.springframework.beans.PropertyValue && java.lang.Object != org.springframework.beans.PropertyValue ) { org.springframework.beans.PropertyValue = ( org.springframework.beans.PropertyValue ) java.lang.Object ; java.lang.Object = org.springframework.beans.PropertyValue . getSource ( ) ; } return org.springframework.beans.PropertyValue ; }  <METHOD_END>
<METHOD_START> public void void ( boolean boolean ) { this . boolean = boolean ; }  <METHOD_END>
<METHOD_START> public boolean boolean ( ) { return this . boolean ; }  <METHOD_END>
<METHOD_START> public synchronized boolean boolean ( ) { return this . boolean ; }  <METHOD_END>
<METHOD_START> public synchronized void void ( java.lang.Object java.lang.Object ) { this . boolean = true ; this . java.lang.Object = java.lang.Object ; }  <METHOD_END>
<METHOD_START> public synchronized java.lang.Object java.lang.Object ( ) { return this . java.lang.Object ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public boolean boolean ( java.lang.Object java.lang.Object ) { if ( this == java.lang.Object ) { return true ; } if ( ! ( java.lang.Object instanceof org.springframework.beans.PropertyValue ) ) { return false ; } org.springframework.beans.PropertyValue org.springframework.beans.PropertyValue = ( org.springframework.beans.PropertyValue ) java.lang.Object ; return ( this . java.lang.String . boolean ( org.springframework.beans.PropertyValue . java.lang.String ) && ObjectUtils . nullSafeEquals ( this . java.lang.Object , org.springframework.beans.PropertyValue . java.lang.Object ) && ObjectUtils . nullSafeEquals ( getSource ( ) , org.springframework.beans.PropertyValue . getSource ( ) ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public int int ( ) { return this . java.lang.String . int ( ) * NUMBER + ObjectUtils . nullSafeHashCode ( this . java.lang.Object ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.String java.lang.String ( ) { return STRING + this . java.lang.String + STRING ; }  <METHOD_END>
