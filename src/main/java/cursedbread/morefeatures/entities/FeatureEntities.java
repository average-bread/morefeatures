package cursedbread.morefeatures.entities;

import cursedbread.morefeatures.FeaturesMain;
import cursedbread.morefeatures.entities.tnt.EntityX5PrimedTnt;
import net.minecraft.core.util.collection.NamespaceID;
import turniplabs.halplibe.helper.EntityHelper;

public class FeatureEntities {
	public void initilizeEntities(){
		EntityHelper.createEntity(EntityX5PrimedTnt.class, NamespaceID.getPermanent(FeaturesMain.MOD_ID, "x5.tnt"), "x5.tnt");
	}
}
