package me.hsgamer.bettergui.betterforms.custom;

import me.hsgamer.bettergui.api.menu.MenuElement;
import org.geysermc.cumulus.form.CustomForm;
import org.geysermc.cumulus.response.CustomFormResponse;

import java.util.UUID;

public interface CustomFormComponent extends MenuElement {
    void apply(UUID uuid, CustomForm.Builder builder);

    default void handle(UUID uuid, CustomFormResponse response) {
        // EMPTY
    }

    default void execute(UUID uuid, CustomFormResponse response) {
        // EMPTY
    }

    default String getValue(UUID uuid) {
        return "";
    }
}
