import com.jwebmp.plugins.materialicons.implementations.MaterialIconsInclusionModule;

module com.jwebmp.plugins.materialicons {

	exports com.jwebmp.plugins.materialicons;

	requires com.jwebmp.core;
	

	requires jakarta.validation;
	requires java.logging;
	requires com.guicedee.guicedinjection;

	provides com.jwebmp.core.services.IPageConfigurator with com.jwebmp.plugins.materialicons.MaterialIconsPageConfigurator;
	provides com.guicedee.guicedinjection.interfaces.IGuiceScanModuleInclusions with MaterialIconsInclusionModule;
	
	provides com.guicedee.guicedinjection.interfaces.IGuiceScanModuleExclusions with com.jwebmp.plugins.materialicons.implementations.MaterialIconsExclusionsModule;

	opens com.jwebmp.plugins.materialicons to com.fasterxml.jackson.databind, com.jwebmp.core;
}
