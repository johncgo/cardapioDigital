package br.ufrpe.cardapiodigital;

import br.ufrpe.cardapiodigital.CardapioDigitalApp;
import br.ufrpe.cardapiodigital.config.AsyncSyncConfiguration;
import br.ufrpe.cardapiodigital.config.EmbeddedKafka;
import br.ufrpe.cardapiodigital.config.EmbeddedSQL;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;

/**
 * Base composite annotation for integration tests.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@SpringBootTest(classes = { CardapioDigitalApp.class, AsyncSyncConfiguration.class })
@EmbeddedKafka
@EmbeddedSQL
@DirtiesContext(classMode = DirtiesContext.ClassMode.AFTER_CLASS)
public @interface IntegrationTest {
}
