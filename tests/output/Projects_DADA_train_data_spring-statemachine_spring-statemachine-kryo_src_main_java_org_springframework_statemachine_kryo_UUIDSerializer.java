<METHOD_START> public void ( ) { setImmutable ( true ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( final Kryo org.springframework.statemachine.kryo.Kryo , final Output org.springframework.statemachine.kryo.Output , final java.util.UUID java.util.UUID ) { org.springframework.statemachine.kryo.Output . writeLong ( java.util.UUID . long ( ) ) ; org.springframework.statemachine.kryo.Output . writeLong ( java.util.UUID . long ( ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.util.UUID java.util.UUID ( final Kryo org.springframework.statemachine.kryo.Kryo , final Input org.springframework.statemachine.kryo.Input , final java.lang.Class<java.util.UUID> < java.util.UUID > java.lang.Class<java.util.UUID> ) { return new java.util.UUID ( org.springframework.statemachine.kryo.Input . readLong ( ) , org.springframework.statemachine.kryo.Input . readLong ( ) ) ; }  <METHOD_END>