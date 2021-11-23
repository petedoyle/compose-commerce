package dev.petedoyle.snappy.cart

import dev.petedoyle.snappy.common.flux.Store

interface CartStore : Store<CartState, CartStoreActions>
