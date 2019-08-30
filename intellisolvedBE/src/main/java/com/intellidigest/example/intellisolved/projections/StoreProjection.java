package com.intellidigest.example.intellisolved.projections;

import com.intellidigest.example.intellisolved.models.Store;
import com.intellidigest.example.intellisolved.models.User;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "embedded", types = Store.class)
public interface StoreProjection {
   Long getId();
   String getName();
   String getAddress();
   String getCity();
   String getPostcode();
   User getUser();

}
