package miproyecto;

import org.springframework.context.annotation.Bean;

import miproyecto.core.driven_ports.BookRepository;
import miproyecto.core.driver_ports.BookService;
import miproyecto.core.driver_ports.BookServiceImpl;

public class SpringBeans {
	@Bean
	BookService bookService(final BookRepository bookRepository) {
		return new BookServiceImpl(bookRepository);

	}
}
