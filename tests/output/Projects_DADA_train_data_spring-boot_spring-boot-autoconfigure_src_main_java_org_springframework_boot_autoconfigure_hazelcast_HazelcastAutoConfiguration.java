<METHOD_START> void ( HazelcastProperties org.springframework.boot.autoconfigure.hazelcast.HazelcastProperties ) { this . org.springframework.boot.autoconfigure.hazelcast.HazelcastProperties = org.springframework.boot.autoconfigure.hazelcast.HazelcastProperties ; }  <METHOD_END>
<METHOD_START> @ Bean public org.springframework.boot.autoconfigure.hazelcast.HazelcastInstance org.springframework.boot.autoconfigure.hazelcast.HazelcastInstance ( ) java.io.IOException { Resource org.springframework.boot.autoconfigure.hazelcast.Resource = this . org.springframework.boot.autoconfigure.hazelcast.HazelcastProperties . resolveConfigLocation ( ) ; if ( org.springframework.boot.autoconfigure.hazelcast.Resource != null ) { return new HazelcastInstanceFactory ( org.springframework.boot.autoconfigure.hazelcast.Resource ) . getHazelcastInstance ( ) ; } return Hazelcast . newHazelcastInstance ( ) ; }  <METHOD_END>
<METHOD_START> @ Bean public org.springframework.boot.autoconfigure.hazelcast.HazelcastInstance org.springframework.boot.autoconfigure.hazelcast.HazelcastInstance ( Config org.springframework.boot.autoconfigure.hazelcast.Config ) { return new HazelcastInstanceFactory ( org.springframework.boot.autoconfigure.hazelcast.Config ) . getHazelcastInstance ( ) ; }  <METHOD_END>
<METHOD_START> void ( ) { super( STRING , STRING ); }  <METHOD_END>