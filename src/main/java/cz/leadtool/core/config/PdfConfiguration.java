package cz.leadtool.core.config;

import com.lowagie.text.pdf.BaseFont;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Role;
import org.xhtmlrenderer.pdf.ITextRenderer;

import java.util.function.Supplier;

@Role(BeanDefinition.ROLE_INFRASTRUCTURE)
@Configuration
@Slf4j
class PdfConfiguration {
    @Bean
    public Supplier<ITextRenderer> rendererSupplier() throws Exception {
        var fontPath = "templates/GrechenFuemen-Regular.ttf";
        // to eager test it's working
        ITextRenderer r = new ITextRenderer();
        r.getFontResolver().addFont(fontPath, BaseFont.IDENTITY_H, BaseFont.NOT_EMBEDDED);

        return () -> {
            try {
                ITextRenderer renderer = new ITextRenderer();
                renderer.getFontResolver().addFont(fontPath,
                        BaseFont.IDENTITY_H, BaseFont.NOT_EMBEDDED);
                return renderer;
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        };
    }
}
