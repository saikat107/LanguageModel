<METHOD_START> public void ( java.lang.Class<? extends java.lang.Number> < ? extends java.lang.Number > java.lang.Class<? extends java.lang.Number> , boolean boolean ) throws java.lang.IllegalArgumentException { this( java.lang.Class<> , null , boolean ); }  <METHOD_END>
<METHOD_START> public void ( java.lang.Class<? extends java.lang.Number> < ? extends java.lang.Number > java.lang.Class<? extends java.lang.Number> , java.text.NumberFormat java.text.NumberFormat , boolean boolean ) throws java.lang.IllegalArgumentException { if ( java.lang.Class<> == null || ! java.lang.Number .class . boolean ( java.lang.Class<> ) ) { throw new java.lang.IllegalArgumentException ( STRING ) ; } this . java.lang.Class<? extends java.lang.Number> = java.lang.Class<> ; this . java.text.NumberFormat = java.text.NumberFormat ; this . boolean = boolean ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( java.lang.String java.lang.String ) throws java.lang.IllegalArgumentException { if ( this . boolean && ! StringUtils . hasText ( java.lang.String ) ) { void ( null ) ; } else if ( this . java.text.NumberFormat != null ) { void ( NumberUtils . parseNumber ( java.lang.String , this . java.lang.Class<> , this . java.text.NumberFormat ) ) ; } else { void ( NumberUtils . parseNumber ( java.lang.String , this . java.lang.Class<> ) ) ; } }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( java.lang.Object java.lang.Object ) { if ( java.lang.Object instanceof java.lang.Number ) { super. void ( NumberUtils . convertNumberToTargetClass ( ( java.lang.Number ) java.lang.Object , this . java.lang.Class<> ) ) ; } else { super. void ( java.lang.Object ) ; } }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.String java.lang.String ( ) { java.lang.Object java.lang.Object = java.lang.Object ( ) ; if ( java.lang.Object == null ) { return STRING ; } if ( this . java.text.NumberFormat != null ) { return this . java.text.NumberFormat . java.lang.String ( java.lang.Object ) ; } else { return java.lang.Object . java.lang.String ( ) ; } }  <METHOD_END>
