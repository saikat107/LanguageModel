<METHOD_START> public void void ( java.lang.Integer java.lang.Integer ) { this . java.lang.Integer = java.lang.Integer ; }  <METHOD_END>
<METHOD_START> protected java.lang.Integer java.lang.Integer ( ) { return this . java.lang.Integer ; }  <METHOD_END>
<METHOD_START> public void void ( boolean boolean ) { this . boolean = boolean ; }  <METHOD_END>
<METHOD_START> protected boolean boolean ( ) { return this . boolean ; }  <METHOD_END>
<METHOD_START> public void void ( boolean boolean ) { this . boolean = boolean ; }  <METHOD_END>
<METHOD_START> protected boolean boolean ( ) { return this . boolean ; }  <METHOD_END>
<METHOD_START> public void void ( ParameterNameDiscoverer org.springframework.jmx.export.assembler.ParameterNameDiscoverer ) { this . org.springframework.jmx.export.assembler.ParameterNameDiscoverer = org.springframework.jmx.export.assembler.ParameterNameDiscoverer ; }  <METHOD_END>
<METHOD_START> protected org.springframework.jmx.export.assembler.ParameterNameDiscoverer org.springframework.jmx.export.assembler.ParameterNameDiscoverer ( ) { return this . org.springframework.jmx.export.assembler.ParameterNameDiscoverer ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected javax.management.modelmbean.ModelMBeanAttributeInfo [] javax.management.modelmbean.ModelMBeanAttributeInfo[] ( java.lang.Object java.lang.Object , java.lang.String java.lang.String ) throws javax.management.JMException { java.beans.PropertyDescriptor [] java.beans.PropertyDescriptor[] = BeanUtils . getPropertyDescriptors ( getClassToExpose ( java.lang.Object ) ) ; java.util.List<javax.management.modelmbean.ModelMBeanAttributeInfo> < javax.management.modelmbean.ModelMBeanAttributeInfo > java.util.List<javax.management.modelmbean.ModelMBeanAttributeInfo> = new java.util.ArrayList<javax.management.modelmbean.ModelMBeanAttributeInfo> <> ( ) ; for ( java.beans.PropertyDescriptor java.beans.PropertyDescriptor : java.beans.PropertyDescriptor[] ) { java.lang.reflect.Method java.lang.reflect.Method = java.beans.PropertyDescriptor . java.lang.reflect.Method ( ) ; if ( java.lang.reflect.Method != null && java.lang.reflect.Method . java.lang.Class<?> ( ) == java.lang.Object .class ) { continue; } if ( java.lang.reflect.Method != null && ! boolean ( java.lang.reflect.Method , java.lang.String ) ) { java.lang.reflect.Method = null ; } java.lang.reflect.Method java.lang.reflect.Method = java.beans.PropertyDescriptor . java.lang.reflect.Method ( ) ; if ( java.lang.reflect.Method != null && ! boolean ( java.lang.reflect.Method , java.lang.String ) ) { java.lang.reflect.Method = null ; } if ( java.lang.reflect.Method != null || java.lang.reflect.Method != null ) { java.lang.String java.lang.String = JmxUtils . getAttributeName ( java.beans.PropertyDescriptor , boolean ( ) ) ; java.lang.String java.lang.String = java.lang.String ( java.beans.PropertyDescriptor , java.lang.String ) ; javax.management.modelmbean.ModelMBeanAttributeInfo javax.management.modelmbean.ModelMBeanAttributeInfo = new javax.management.modelmbean.ModelMBeanAttributeInfo ( java.lang.String , java.lang.String , java.lang.reflect.Method , java.lang.reflect.Method ) ; javax.management.Descriptor javax.management.Descriptor = javax.management.modelmbean.ModelMBeanAttributeInfo . javax.management.Descriptor ( ) ; if ( java.lang.reflect.Method != null ) { javax.management.Descriptor . void ( java.lang.String , java.lang.reflect.Method . java.lang.String ( ) ) ; } if ( java.lang.reflect.Method != null ) { javax.management.Descriptor . void ( java.lang.String , java.lang.reflect.Method . java.lang.String ( ) ) ; } void ( javax.management.Descriptor , java.lang.reflect.Method , java.lang.reflect.Method , java.lang.String ) ; javax.management.modelmbean.ModelMBeanAttributeInfo . void ( javax.management.Descriptor ) ; java.util.List<javax.management.modelmbean.ModelMBeanAttributeInfo> . boolean ( javax.management.modelmbean.ModelMBeanAttributeInfo ) ; } } return java.util.List<javax.management.modelmbean.ModelMBeanAttributeInfo> . javax.management.modelmbean.ModelMBeanAttributeInfo[] ( new javax.management.modelmbean.ModelMBeanAttributeInfo [ java.util.List<javax.management.modelmbean.ModelMBeanAttributeInfo> . int ( ) ] ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected javax.management.modelmbean.ModelMBeanOperationInfo [] javax.management.modelmbean.ModelMBeanOperationInfo[] ( java.lang.Object java.lang.Object , java.lang.String java.lang.String ) { java.lang.reflect.Method [] java.lang.reflect.Method[] = getClassToExpose ( java.lang.Object ) . getMethods ( ) ; java.util.List<javax.management.modelmbean.ModelMBeanOperationInfo> < javax.management.modelmbean.ModelMBeanOperationInfo > java.util.List<javax.management.modelmbean.ModelMBeanOperationInfo> = new java.util.ArrayList<javax.management.modelmbean.ModelMBeanOperationInfo> <> ( ) ; for ( java.lang.reflect.Method java.lang.reflect.Method : java.lang.reflect.Method[] ) { if ( java.lang.reflect.Method . boolean ( ) ) { continue; } if ( java.lang.Object .class == java.lang.reflect.Method . java.lang.Class<?> ( ) ) { continue; } javax.management.modelmbean.ModelMBeanOperationInfo javax.management.modelmbean.ModelMBeanOperationInfo = null ; java.beans.PropertyDescriptor java.beans.PropertyDescriptor = BeanUtils . findPropertyForMethod ( java.lang.reflect.Method ) ; if ( java.beans.PropertyDescriptor != null ) { if ( ( java.lang.reflect.Method . boolean ( java.beans.PropertyDescriptor . java.lang.reflect.Method ( ) ) && boolean ( java.lang.reflect.Method , java.lang.String ) ) || ( java.lang.reflect.Method . boolean ( java.beans.PropertyDescriptor . java.lang.reflect.Method ( ) ) && boolean ( java.lang.reflect.Method , java.lang.String ) ) ) { javax.management.modelmbean.ModelMBeanOperationInfo = javax.management.modelmbean.ModelMBeanOperationInfo ( java.lang.reflect.Method , java.beans.PropertyDescriptor . java.lang.String ( ) , java.lang.String ) ; javax.management.Descriptor javax.management.Descriptor = javax.management.modelmbean.ModelMBeanOperationInfo . javax.management.Descriptor ( ) ; if ( java.lang.reflect.Method . boolean ( java.beans.PropertyDescriptor . java.lang.reflect.Method ( ) ) ) { javax.management.Descriptor . void ( java.lang.String , java.lang.String ) ; } else { javax.management.Descriptor . void ( java.lang.String , java.lang.String ) ; } javax.management.Descriptor . void ( java.lang.String , int ) ; if ( boolean ( ) ) { javax.management.Descriptor . void ( java.lang.String , java.lang.Class<?> ( java.lang.Object ) . java.lang.String ( ) ) ; } javax.management.modelmbean.ModelMBeanOperationInfo . void ( javax.management.Descriptor ) ; } } if ( javax.management.modelmbean.ModelMBeanOperationInfo == null && boolean ( java.lang.reflect.Method , java.lang.String ) ) { javax.management.modelmbean.ModelMBeanOperationInfo = javax.management.modelmbean.ModelMBeanOperationInfo ( java.lang.reflect.Method , java.lang.reflect.Method . java.lang.String ( ) , java.lang.String ) ; javax.management.Descriptor javax.management.Descriptor = javax.management.modelmbean.ModelMBeanOperationInfo . javax.management.Descriptor ( ) ; javax.management.Descriptor . void ( java.lang.String , java.lang.String ) ; if ( boolean ( ) ) { javax.management.Descriptor . void ( java.lang.String , java.lang.Class<?> ( java.lang.Object ) . java.lang.String ( ) ) ; } void ( javax.management.Descriptor , java.lang.reflect.Method , java.lang.String ) ; javax.management.modelmbean.ModelMBeanOperationInfo . void ( javax.management.Descriptor ) ; } if ( javax.management.modelmbean.ModelMBeanOperationInfo != null ) { java.util.List<javax.management.modelmbean.ModelMBeanOperationInfo> . boolean ( javax.management.modelmbean.ModelMBeanOperationInfo ) ; } } return java.util.List<javax.management.modelmbean.ModelMBeanOperationInfo> . javax.management.modelmbean.ModelMBeanOperationInfo[] ( new javax.management.modelmbean.ModelMBeanOperationInfo [ java.util.List<javax.management.modelmbean.ModelMBeanOperationInfo> . int ( ) ] ) ; }  <METHOD_END>
<METHOD_START> protected javax.management.modelmbean.ModelMBeanOperationInfo javax.management.modelmbean.ModelMBeanOperationInfo ( java.lang.reflect.Method java.lang.reflect.Method , java.lang.String java.lang.String , java.lang.String java.lang.String ) { javax.management.MBeanParameterInfo [] javax.management.MBeanParameterInfo[] = javax.management.MBeanParameterInfo[] ( java.lang.reflect.Method , java.lang.String ) ; if ( javax.management.MBeanParameterInfo[] . int == NUMBER ) { return new javax.management.modelmbean.ModelMBeanOperationInfo ( java.lang.String ( java.lang.reflect.Method , java.lang.String ) , java.lang.reflect.Method ) ; } else { return new javax.management.modelmbean.ModelMBeanOperationInfo ( java.lang.reflect.Method . java.lang.String ( ) , java.lang.String ( java.lang.reflect.Method , java.lang.String ) , javax.management.MBeanParameterInfo[] ( java.lang.reflect.Method , java.lang.String ) , java.lang.reflect.Method . java.lang.Class<?> ( ) . java.lang.String ( ) , javax.management.MBeanOperationInfo . int ) ; } }  <METHOD_END>
<METHOD_START> protected java.lang.Class<?> < ? > java.lang.Class<?> ( java.lang.Object java.lang.Object ) { if ( AopUtils . isJdkDynamicProxy ( java.lang.Object ) ) { return AopProxyUtils . proxiedUserInterfaces ( java.lang.Object ) [ NUMBER ] ; } return getClassToExpose ( java.lang.Object ) ; }  <METHOD_END>
<METHOD_START> protected abstract boolean boolean ( java.lang.reflect.Method java.lang.reflect.Method , java.lang.String java.lang.String );  <METHOD_END>
<METHOD_START> protected abstract boolean boolean ( java.lang.reflect.Method java.lang.reflect.Method , java.lang.String java.lang.String );  <METHOD_END>
<METHOD_START> protected abstract boolean boolean ( java.lang.reflect.Method java.lang.reflect.Method , java.lang.String java.lang.String );  <METHOD_END>
<METHOD_START> protected java.lang.String java.lang.String ( java.beans.PropertyDescriptor java.beans.PropertyDescriptor , java.lang.String java.lang.String ) { return java.beans.PropertyDescriptor . java.lang.String ( ) ; }  <METHOD_END>
<METHOD_START> protected java.lang.String java.lang.String ( java.lang.reflect.Method java.lang.reflect.Method , java.lang.String java.lang.String ) { return java.lang.reflect.Method . java.lang.String ( ) ; }  <METHOD_END>
<METHOD_START> protected javax.management.MBeanParameterInfo [] javax.management.MBeanParameterInfo[] ( java.lang.reflect.Method java.lang.reflect.Method , java.lang.String java.lang.String ) { ParameterNameDiscoverer org.springframework.jmx.export.assembler.ParameterNameDiscoverer = org.springframework.jmx.export.assembler.ParameterNameDiscoverer ( ) ; java.lang.String [] java.lang.String[] = ( org.springframework.jmx.export.assembler.ParameterNameDiscoverer != null ? org.springframework.jmx.export.assembler.ParameterNameDiscoverer . getParameterNames ( java.lang.reflect.Method ) : null ) ; if ( java.lang.String[] == null ) { return new javax.management.MBeanParameterInfo [ NUMBER ] ; } javax.management.MBeanParameterInfo [] javax.management.MBeanParameterInfo[] = new javax.management.MBeanParameterInfo [ java.lang.String[] . int ] ; java.lang.Class<?> < ? > [] java.lang.Class<?>[] = java.lang.reflect.Method . java.lang.Class<?>[] ( ) ; for ( int int = NUMBER ; int < javax.management.MBeanParameterInfo[] . int ; int ++ ) { javax.management.MBeanParameterInfo[] [ int ] = new javax.management.MBeanParameterInfo ( java.lang.String[] [ int ] , java.lang.Class<?>[] [ int ] . java.lang.String ( ) , java.lang.String[] [ int ] ) ; } return javax.management.MBeanParameterInfo[] ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected void void ( javax.management.Descriptor javax.management.Descriptor , java.lang.Object java.lang.Object , java.lang.String java.lang.String ) { void ( javax.management.Descriptor ) ; }  <METHOD_END>
<METHOD_START> protected void void ( javax.management.Descriptor javax.management.Descriptor , java.lang.reflect.Method java.lang.reflect.Method , java.lang.reflect.Method java.lang.reflect.Method , java.lang.String java.lang.String ) { void ( javax.management.Descriptor ) ; }  <METHOD_END>
<METHOD_START> protected void void ( javax.management.Descriptor javax.management.Descriptor , java.lang.reflect.Method java.lang.reflect.Method , java.lang.String java.lang.String ) { void ( javax.management.Descriptor ) ; }  <METHOD_END>
<METHOD_START> protected final void void ( javax.management.Descriptor javax.management.Descriptor ) { if ( java.lang.Integer ( ) != null ) { javax.management.Descriptor . void ( java.lang.String , java.lang.Integer ( ) . java.lang.String ( ) ) ; } }  <METHOD_END>
<METHOD_START> protected void void ( javax.management.Descriptor javax.management.Descriptor , int int ) { if ( int > NUMBER ) { javax.management.Descriptor . void ( java.lang.String , java.lang.Integer . java.lang.String ( int ) ) ; } else if ( int == NUMBER ) { javax.management.Descriptor . void ( java.lang.String , java.lang.Integer . java.lang.String ( java.lang.Integer . int ) ) ; } else { void ( javax.management.Descriptor ) ; } }  <METHOD_END>