<METHOD_START> @ java.lang.Override public org.springframework.integration.store.Message<?> < ? > org.springframework.integration.store.Message<?> ( java.util.UUID java.util.UUID ) { Assert . notNull ( java.util.UUID , STRING ) ; java.lang.Object java.lang.Object = java.lang.Object ( java.lang.String + java.util.UUID ) ; if ( java.lang.Object != null ) { return org.springframework.integration.store.Message<?> ( java.lang.Object ) ; } else { return null ; } }  <METHOD_END>
<METHOD_START> private org.springframework.integration.store.Message<?> < ? > org.springframework.integration.store.Message<?> ( java.lang.Object java.lang.Object ) { if ( java.lang.Object instanceof MessageHolder ) { return ( ( MessageHolder ) java.lang.Object ) . getMessage ( ) ; } else if ( java.lang.Object instanceof Message ) { return ( Message < ? > ) java.lang.Object ; } else { throw new java.lang.IllegalArgumentException ( STRING + java.lang.Object . java.lang.Class<? extends java.lang.Object> ( ) . java.lang.String ( ) + STRING ) ; } }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.integration.store.MessageMetadata org.springframework.integration.store.MessageMetadata ( java.util.UUID java.util.UUID ) { Assert . notNull ( java.util.UUID , STRING ) ; java.lang.Object java.lang.Object = java.lang.Object ( java.lang.String + java.util.UUID ) ; if ( java.lang.Object != null ) { org.springframework.integration.store.Message<?> ( java.lang.Object ) ; if ( java.lang.Object instanceof MessageHolder ) { return ( ( MessageHolder ) java.lang.Object ) . getMessageMetadata ( ) ; } } return null ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override @ java.lang.SuppressWarnings ( STRING ) public < T > org.springframework.integration.store.Message<T> < T > org.springframework.integration.store.Message<T> ( Message < T > org.springframework.integration.store.Message<T> ) { Assert . notNull ( org.springframework.integration.store.Message<T> , STRING ) ; java.util.UUID java.util.UUID = org.springframework.integration.store.Message<T> . getHeaders ( ) . getId ( ) ; void ( java.lang.String + java.util.UUID , new MessageHolder ( org.springframework.integration.store.Message<T> ) ) ; return ( Message < T > ) org.springframework.integration.store.Message<?> ( java.util.UUID ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.integration.store.Message<?> < ? > org.springframework.integration.store.Message<?> ( java.util.UUID java.util.UUID ) { Assert . notNull ( java.util.UUID , STRING ) ; java.lang.Object java.lang.Object = java.lang.Object ( java.lang.String + java.util.UUID ) ; if ( java.lang.Object != null ) { return org.springframework.integration.store.Message<?> ( java.lang.Object ) ; } else { return null ; } }  <METHOD_END>
<METHOD_START> @ java.lang.Override @ ManagedAttribute public long long ( ) { java.util.Collection<?> < ? > java.util.Collection<?> = java.util.Collection<?> ( java.lang.String + STRING ) ; return ( java.util.Collection<> != null ) ? java.util.Collection<> . int ( ) : NUMBER ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.integration.store.MessageGroup org.springframework.integration.store.MessageGroup ( java.lang.Object java.lang.Object ) { MessageGroupMetadata org.springframework.integration.store.MessageGroupMetadata = org.springframework.integration.store.MessageGroupMetadata ( java.lang.Object ) ; if ( org.springframework.integration.store.MessageGroupMetadata != null ) { MessageGroup org.springframework.integration.store.MessageGroup = getMessageGroupFactory ( ) . create ( this , java.lang.Object , org.springframework.integration.store.MessageGroupMetadata . getTimestamp ( ) , org.springframework.integration.store.MessageGroupMetadata . isComplete ( ) ) ; org.springframework.integration.store.MessageGroup . setLastModified ( org.springframework.integration.store.MessageGroupMetadata . getLastModified ( ) ) ; org.springframework.integration.store.MessageGroup . setLastReleasedMessageSequenceNumber ( org.springframework.integration.store.MessageGroupMetadata . getLastReleasedMessageSequenceNumber ( ) ) ; return org.springframework.integration.store.MessageGroup ; } else { return new SimpleMessageGroup ( java.lang.Object ) ; } }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.integration.store.MessageGroupMetadata org.springframework.integration.store.MessageGroupMetadata ( java.lang.Object java.lang.Object ) { Assert . notNull ( java.lang.Object , STRING ) ; java.lang.Object java.lang.Object = this . java.lang.Object ( java.lang.String + java.lang.Object ) ; if ( java.lang.Object != null ) { Assert . isInstanceOf ( MessageGroupMetadata .class , java.lang.Object ) ; return ( MessageGroupMetadata ) java.lang.Object ; } return null ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( java.lang.Object java.lang.Object , org.springframework.integration.store.Message<?> < ? > ... org.springframework.integration.store.Message<?>[] ) { Assert . notNull ( java.lang.Object , STRING ) ; Assert . notNull ( org.springframework.integration.store.Message<?>[] , STRING ) ; MessageGroupMetadata org.springframework.integration.store.MessageGroupMetadata = org.springframework.integration.store.MessageGroupMetadata ( java.lang.Object ) ; SimpleMessageGroup org.springframework.integration.store.SimpleMessageGroup = null ; if ( org.springframework.integration.store.MessageGroupMetadata == null ) { org.springframework.integration.store.SimpleMessageGroup = new SimpleMessageGroup ( java.lang.Object ) ; } for ( Message < ? > org.springframework.integration.store.Message<?> : org.springframework.integration.store.Message<?>[] ) { org.springframework.integration.store.Message ( org.springframework.integration.store.Message<> ) ; if ( org.springframework.integration.store.MessageGroupMetadata != null ) { org.springframework.integration.store.MessageGroupMetadata . add ( org.springframework.integration.store.Message<> . getHeaders ( ) . getId ( ) ) ; } else { org.springframework.integration.store.SimpleMessageGroup . add ( org.springframework.integration.store.Message<> ) ; } } if ( org.springframework.integration.store.SimpleMessageGroup != null ) { org.springframework.integration.store.MessageGroupMetadata = new MessageGroupMetadata ( org.springframework.integration.store.SimpleMessageGroup ) ; org.springframework.integration.store.MessageGroupMetadata . setLastModified ( org.springframework.integration.store.SimpleMessageGroup . getTimestamp ( ) ) ; } else { org.springframework.integration.store.MessageGroupMetadata . setLastModified ( java.lang.System . long ( ) ) ; } void ( java.lang.String + java.lang.Object , org.springframework.integration.store.MessageGroupMetadata ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( java.lang.Object java.lang.Object , java.util.Collection<org.springframework.integration.store.Message<?>> < Message < ? > > java.util.Collection<org.springframework.integration.store.Message<?>> ) { Assert . notNull ( java.lang.Object , STRING ) ; Assert . notNull ( java.util.Collection<org.springframework.integration.store.Message<?>> , STRING ) ; java.lang.Object java.lang.Object = java.lang.Object ( java.lang.String + java.lang.Object ) ; if ( java.lang.Object != null ) { Assert . isInstanceOf ( MessageGroupMetadata .class , java.lang.Object ) ; MessageGroupMetadata org.springframework.integration.store.MessageGroupMetadata = ( MessageGroupMetadata ) java.lang.Object ; for ( Message < ? > org.springframework.integration.store.Message<?> : java.util.Collection<org.springframework.integration.store.Message<?>> ) { java.util.UUID java.util.UUID = org.springframework.integration.store.Message<> . getHeaders ( ) . getId ( ) ; org.springframework.integration.store.MessageGroupMetadata . remove ( java.util.UUID ) ; java.lang.Object ( java.lang.String + java.util.UUID ) ; } org.springframework.integration.store.MessageGroupMetadata . setLastModified ( java.lang.System . long ( ) ) ; void ( java.lang.String + java.lang.Object , org.springframework.integration.store.MessageGroupMetadata ) ; } }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( java.lang.Object java.lang.Object ) { Assert . notNull ( java.lang.Object , STRING ) ; MessageGroupMetadata org.springframework.integration.store.MessageGroupMetadata = org.springframework.integration.store.MessageGroupMetadata ( java.lang.Object ) ; if ( org.springframework.integration.store.MessageGroupMetadata != null ) { org.springframework.integration.store.MessageGroupMetadata . complete ( ) ; org.springframework.integration.store.MessageGroupMetadata . setLastModified ( java.lang.System . long ( ) ) ; void ( java.lang.String + java.lang.Object , org.springframework.integration.store.MessageGroupMetadata ) ; } }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( java.lang.Object java.lang.Object ) { Assert . notNull ( java.lang.Object , STRING ) ; java.lang.Object java.lang.Object = java.lang.Object ( java.lang.String + java.lang.Object ) ; if ( java.lang.Object != null ) { Assert . isInstanceOf ( MessageGroupMetadata .class , java.lang.Object ) ; MessageGroupMetadata org.springframework.integration.store.MessageGroupMetadata = ( MessageGroupMetadata ) java.lang.Object ; java.util.Iterator<java.util.UUID> < java.util.UUID > java.util.Iterator<java.util.UUID> = org.springframework.integration.store.MessageGroupMetadata . messageIdIterator ( ) ; while ( java.util.Iterator<java.util.UUID> . boolean ( ) ) { org.springframework.integration.store.Message<?> ( java.util.Iterator<java.util.UUID> . java.util.UUID ( ) ) ; } } }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( java.lang.Object java.lang.Object , int int ) { Assert . notNull ( java.lang.Object , STRING ) ; MessageGroupMetadata org.springframework.integration.store.MessageGroupMetadata = org.springframework.integration.store.MessageGroupMetadata ( java.lang.Object ) ; if ( org.springframework.integration.store.MessageGroupMetadata == null ) { SimpleMessageGroup org.springframework.integration.store.SimpleMessageGroup = new SimpleMessageGroup ( java.lang.Object ) ; org.springframework.integration.store.MessageGroupMetadata = new MessageGroupMetadata ( org.springframework.integration.store.SimpleMessageGroup ) ; } org.springframework.integration.store.MessageGroupMetadata . setLastReleasedMessageSequenceNumber ( int ) ; org.springframework.integration.store.MessageGroupMetadata . setLastModified ( java.lang.System . long ( ) ) ; void ( java.lang.String + java.lang.Object , org.springframework.integration.store.MessageGroupMetadata ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.integration.store.Message<?> < ? > org.springframework.integration.store.Message<?> ( java.lang.Object java.lang.Object ) { MessageGroupMetadata org.springframework.integration.store.MessageGroupMetadata = org.springframework.integration.store.MessageGroupMetadata ( java.lang.Object ) ; if ( org.springframework.integration.store.MessageGroupMetadata != null ) { java.util.UUID java.util.UUID = org.springframework.integration.store.MessageGroupMetadata . firstId ( ) ; if ( java.util.UUID != null ) { org.springframework.integration.store.MessageGroupMetadata . remove ( java.util.UUID ) ; org.springframework.integration.store.MessageGroupMetadata . setLastModified ( java.lang.System . long ( ) ) ; void ( java.lang.String + java.lang.Object , org.springframework.integration.store.MessageGroupMetadata ) ; return org.springframework.integration.store.Message<?> ( java.util.UUID ) ; } } return null ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.integration.store.Message<?> < ? > org.springframework.integration.store.Message<?> ( java.lang.Object java.lang.Object ) { MessageGroupMetadata org.springframework.integration.store.MessageGroupMetadata = org.springframework.integration.store.MessageGroupMetadata ( java.lang.Object ) ; if ( org.springframework.integration.store.MessageGroupMetadata != null ) { java.util.UUID java.util.UUID = org.springframework.integration.store.MessageGroupMetadata . firstId ( ) ; if ( java.util.UUID != null ) { return org.springframework.integration.store.Message<?> ( java.util.UUID ) ; } } return null ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.util.Collection<org.springframework.integration.store.Message<?>> < Message < ? > > java.util.Collection<org.springframework.integration.store.Message<?>> ( java.lang.Object java.lang.Object ) { MessageGroupMetadata org.springframework.integration.store.MessageGroupMetadata = org.springframework.integration.store.MessageGroupMetadata ( java.lang.Object ) ; java.util.ArrayList<org.springframework.integration.store.Message<?>> < Message < ? > > java.util.ArrayList<org.springframework.integration.store.Message<?>> = new java.util.ArrayList<org.springframework.integration.store.Message<?>> < Message < ? > > ( ) ; if ( org.springframework.integration.store.MessageGroupMetadata != null ) { java.util.Iterator<java.util.UUID> < java.util.UUID > java.util.Iterator<java.util.UUID> = org.springframework.integration.store.MessageGroupMetadata . messageIdIterator ( ) ; while ( java.util.Iterator<java.util.UUID> . boolean ( ) ) { java.util.ArrayList<org.springframework.integration.store.Message<?>> . add ( org.springframework.integration.store.Message<?> ( java.util.Iterator<java.util.UUID> . java.util.UUID ( ) ) ) ; } } return java.util.ArrayList<org.springframework.integration.store.Message<?>> ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override @ java.lang.SuppressWarnings ( STRING ) public java.util.Iterator<org.springframework.integration.store.MessageGroup> < MessageGroup > java.util.Iterator<org.springframework.integration.store.MessageGroup> ( ) { final java.util.Iterator<?> < ? > java.util.Iterator<?> = java.util.Collection<java.lang.String> ( ( java.util.Collection<java.lang.String> < java.lang.String > ) java.util.Collection<?> ( java.lang.String + STRING ) ) . java.util.Iterator<java.lang.String> ( ) ; return new org.springframework.integration.store.AbstractKeyValueMessageStore.MessageGroupIterator ( java.util.Iterator<> ) ; }  <METHOD_END>
<METHOD_START> private java.util.Collection<java.lang.String> < java.lang.String > java.util.Collection<java.lang.String> ( java.util.Collection<java.lang.String> < java.lang.String > java.util.Collection<java.lang.String> ) { java.util.Set<java.lang.String> < java.lang.String > java.util.Set<java.lang.String> = new java.util.HashSet<java.lang.String> < java.lang.String > ( ) ; for ( java.lang.Object java.lang.Object : java.util.Collection<java.lang.String> ) { java.lang.String java.lang.String = ( java.lang.String ) java.lang.Object ; if ( java.lang.String . boolean ( java.lang.String ) ) { java.lang.String = java.lang.String . java.lang.String ( java.lang.String , STRING ) ; } else if ( java.lang.String . boolean ( java.lang.String ) ) { java.lang.String = java.lang.String . java.lang.String ( java.lang.String , STRING ) ; } java.util.Set<java.lang.String> . boolean ( java.lang.String ) ; } return java.util.Set<java.lang.String> ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public int int ( java.lang.Object java.lang.Object ) { MessageGroupMetadata org.springframework.integration.store.MessageGroupMetadata = org.springframework.integration.store.MessageGroupMetadata ( java.lang.Object ) ; if ( org.springframework.integration.store.MessageGroupMetadata != null ) { return org.springframework.integration.store.MessageGroupMetadata . size ( ) ; } else { return NUMBER ; } }  <METHOD_END>
<METHOD_START> protected abstract java.lang.Object java.lang.Object ( java.lang.Object java.lang.Object );  <METHOD_END>
<METHOD_START> protected abstract void void ( java.lang.Object java.lang.Object , java.lang.Object java.lang.Object );  <METHOD_END>
<METHOD_START> protected abstract void void ( java.lang.Object java.lang.Object , java.lang.Object java.lang.Object );  <METHOD_END>
<METHOD_START> protected abstract java.lang.Object java.lang.Object ( java.lang.Object java.lang.Object );  <METHOD_END>
<METHOD_START> protected abstract java.util.Collection<?> < ? > java.util.Collection<?> ( java.lang.String java.lang.String );  <METHOD_END>
<METHOD_START> void ( java.util.Iterator<?> < ? > java.util.Iterator<?> ) { this . java.util.Iterator<?> = java.util.Iterator<> ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public boolean boolean ( ) { return this . java.util.Iterator<> . boolean ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.integration.store.MessageGroup org.springframework.integration.store.MessageGroup ( ) { java.lang.Object java.lang.Object = this . java.util.Iterator<> . next ( ) ; return org.springframework.integration.store.MessageGroup ( java.lang.Object ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( ) { throw new java.lang.UnsupportedOperationException ( ) ; }  <METHOD_END>