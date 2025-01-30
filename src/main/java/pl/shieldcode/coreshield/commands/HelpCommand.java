package pl.shieldcode.coreshield.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

public class HelpCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (command.getName().equalsIgnoreCase("pomoc") || command.getName().equalsIgnoreCase("help") ) {
            if (sender instanceof Player) {
                Player p = (Player) sender;
                if (sender.hasPermission("shieldcode.pomoc")) {
                    Inventory inv = Bukkit.createInventory(null, 54, ChatColor.RED + "Pomoc" + ChatColor.GRAY + " (/pomoc)");

                    ItemStack glowne = new ItemStack(Material.GRASS_BLOCK);
                    ItemMeta glowneMeta = glowne.getItemMeta();
                    glowneMeta.setDisplayName(ChatColor.RED + "Glowne komendy:");
                    List<String> glowneLore = new ArrayList<>();
                    glowneLore.add(ChatColor.GREEN + "/kit" +ChatColor.GRAY + ">> " + ChatColor.GREEN + "Kliknij, aby utworzyć świat z one blockami");
                    glowneMeta.setLore(glowneLore);
                    glowne.setItemMeta(glowneMeta);


                    ItemStack full = new ItemStack(Material.GRAY_STAINED_GLASS_PANE);


                    inv.setItem(23, glowne);

                    p.openInventory(inv);
                }
            }
        }
        return false;

    }
}
