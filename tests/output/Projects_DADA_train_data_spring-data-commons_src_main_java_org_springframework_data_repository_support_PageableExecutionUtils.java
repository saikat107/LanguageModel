<METHOD_START> public static < T > org.springframework.data.repository.support.Page<T> < T > org.springframework.data.repository.support.Page<T> ( java.util.List<T> < T > java.util.List<T> , Pageable org.springframework.data.repository.support.Pageable , java.util.function.LongSupplier java.util.function.LongSupplier ) { Assert . notNull ( java.util.List<T> , STRING ) ; Assert . notNull ( org.springframework.data.repository.support.Pageable , STRING ) ; Assert . notNull ( java.util.function.LongSupplier , STRING ) ; if ( org.springframework.data.repository.support.Pageable . isUnpaged ( ) || org.springframework.data.repository.support.Pageable . getOffset ( ) == NUMBER ) { if ( org.springframework.data.repository.support.Pageable . isUnpaged ( ) || org.springframework.data.repository.support.Pageable . getPageSize ( ) > java.util.List<T> . int ( ) ) { return new PageImpl <> ( java.util.List<T> , org.springframework.data.repository.support.Pageable , java.util.List<T> . int ( ) ) ; } return new PageImpl <> ( java.util.List<T> , org.springframework.data.repository.support.Pageable , java.util.function.LongSupplier . long ( ) ) ; } if ( java.util.List<T> . int ( ) != NUMBER && org.springframework.data.repository.support.Pageable . getPageSize ( ) > java.util.List<T> . int ( ) ) { return new PageImpl <> ( java.util.List<T> , org.springframework.data.repository.support.Pageable , org.springframework.data.repository.support.Pageable . getOffset ( ) + java.util.List<T> . int ( ) ) ; } return new PageImpl <> ( java.util.List<T> , org.springframework.data.repository.support.Pageable , java.util.function.LongSupplier . long ( ) ) ; }  <METHOD_END>
