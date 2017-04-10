package io.lbry.sdk.model;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * Created by harolddost on 4/10/17.
 */
public class LbryObject {

    public static final Gson PRETTY_PRINT_GSON = new GsonBuilder().setPrettyPrinting()
                                                                  .serializeNulls()
                                                                  .setFieldNamingPolicy(
                                                                      FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES )
                                                                  .create();

    public String toJson() {

        return PRETTY_PRINT_GSON.toJson( this );
    }
}
