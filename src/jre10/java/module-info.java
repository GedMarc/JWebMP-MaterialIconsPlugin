import com.jwebmp.core.services.IPageConfigurator;
import com.jwebmp.plugins.materialicons.MaterialIconsPageConfigurator;

module com.jwebmp.plugins.materialicons {

	exports com.jwebmp.plugins.materialicons;

	requires com.jwebmp.core;
	requires com.jwebmp.logmaster;
	requires com.fasterxml.jackson.annotation;

	requires java.validation;
	requires java.logging;

	provides IPageConfigurator with MaterialIconsPageConfigurator;
}
