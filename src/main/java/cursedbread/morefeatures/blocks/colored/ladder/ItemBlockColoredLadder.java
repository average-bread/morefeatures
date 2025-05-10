package cursedbread.morefeatures.blocks.colored.ladder;

import net.minecraft.core.block.Block;
import net.minecraft.core.item.block.ItemBlockLadder;

public class ItemBlockColoredLadder <T extends BlockLogicColoredLadder> extends ItemBlockLadder<T> {
	public ItemBlockColoredLadder(Block<T> block) {
		super(block);
	}
}
