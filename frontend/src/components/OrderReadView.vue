<template>

    <v-data-table
        :headers="headers"
        :items="orderRead"
        :items-per-page="5"
        class="elevation-1"
    ></v-data-table>

</template>

<script>
    const axios = require('axios').default;

    export default {
        name: 'OrderReadView',
        props: {
            value: Object,
            editMode: Boolean,
            isNew: Boolean
        },
        data: () => ({
            headers: [
                { text: "id", value: "id" },
            ],
            orderRead : [],
        }),
          async created() {
            var temp = await axios.get(axios.fixUrl('/orderReads'))

            temp.data._embedded.orderReads.map(obj => obj.id=obj._links.self.href.split("/")[obj._links.self.href.split("/").length - 1])

            this.orderRead = temp.data._embedded.orderReads;
        },
        methods: {
        }
    }
</script>

