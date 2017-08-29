<METHOD_START> public abstract java.lang.Iterable<T> < T > java.lang.Iterable<T> ( T T );  <METHOD_END>
<METHOD_START> public final java.lang.Iterable<T> < T > java.lang.Iterable<T> ( final T T ) { Assert . notNull ( T ) ; return new java.lang.Iterable<T> < T > ( ) { @ java.lang.Override public java.util.Iterator<T> < T > java.util.Iterator<T> ( ) { return java.util.Iterator<T> ( T ) ; } } ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.util.Iterator<T> < T > java.util.Iterator<T> ( ) { return java.util.Iterator<T> ( T ) ; }  <METHOD_END>
<METHOD_START> java.util.Iterator<T> < T > java.util.Iterator<T> ( T T ) { return new org.springframework.statemachine.support.tree.TreeTraverser<T>.PostOrderIterator ( T ) ; }  <METHOD_END>
<METHOD_START> void ( T T , java.util.Iterator<T> < T > java.util.Iterator<T> ) { Assert . notNull ( T ) ; Assert . notNull ( java.util.Iterator<T> ) ; this . T = T ; this . java.util.Iterator<T> = java.util.Iterator<T> ; }  <METHOD_END>
<METHOD_START> void ( T T ) { this . java.util.ArrayDeque<org.springframework.statemachine.support.tree.TreeTraverser.PostOrderNode<T>> = new java.util.ArrayDeque<org.springframework.statemachine.support.tree.TreeTraverser.PostOrderNode<T>> < org.springframework.statemachine.support.tree.TreeTraverser.PostOrderNode<T> < T > > ( ) ; java.util.ArrayDeque<org.springframework.statemachine.support.tree.TreeTraverser.PostOrderNode<T>> . void ( org.springframework.statemachine.support.tree.TreeTraverser.PostOrderNode<T> ( T ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected T T ( ) { while ( ! java.util.ArrayDeque<org.springframework.statemachine.support.tree.TreeTraverser.PostOrderNode<T>> . boolean ( ) ) { org.springframework.statemachine.support.tree.TreeTraverser.PostOrderNode<T> < T > org.springframework.statemachine.support.tree.TreeTraverser.PostOrderNode<T> = java.util.ArrayDeque<org.springframework.statemachine.support.tree.TreeTraverser.PostOrderNode<T>> . org.springframework.statemachine.support.tree.TreeTraverser.PostOrderNode<T> ( ) ; if ( org.springframework.statemachine.support.tree.TreeTraverser.PostOrderNode<T> . java.util.Iterator<T> . boolean ( ) ) { T T = org.springframework.statemachine.support.tree.TreeTraverser.PostOrderNode<T> . java.util.Iterator<T> . T ( ) ; java.util.ArrayDeque<org.springframework.statemachine.support.tree.TreeTraverser.PostOrderNode<T>> . void ( org.springframework.statemachine.support.tree.TreeTraverser.PostOrderNode<T> ( T ) ) ; } else { java.util.ArrayDeque<org.springframework.statemachine.support.tree.TreeTraverser.PostOrderNode<T>> . org.springframework.statemachine.support.tree.TreeTraverser.PostOrderNode<T> ( ) ; return org.springframework.statemachine.support.tree.TreeTraverser.PostOrderNode<T> . T ; } } return endOfData ( ) ; }  <METHOD_END>
<METHOD_START> private org.springframework.statemachine.support.tree.TreeTraverser.PostOrderNode<T> < T > org.springframework.statemachine.support.tree.TreeTraverser.PostOrderNode<T> ( T T ) { return new org.springframework.statemachine.support.tree.TreeTraverser.PostOrderNode<T> < T > ( T , java.lang.Iterable<T> ( T ) . java.util.Iterator<T> ( ) ) ; }  <METHOD_END>
