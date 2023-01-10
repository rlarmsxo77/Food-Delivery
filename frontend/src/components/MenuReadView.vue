<template>

    <v-data-table
        :headers="headers"
        :items="menuRead"
        :items-per-page="5"
        class="elevation-1"
    ></v-data-table>

</template>

<script>
    const axios = require('axios').default;

    export default {
        name: 'MenuReadView',
        props: {
            value: Object,
            editMode: Boolean,
            isNew: Boolean
        },
        data: () => ({
            headers: [
                { text: "id", value: "id" },
            ],
            menuRead : [],
        }),
          async created() {
            var temp = await axios.get(axios.fixUrl('/menuReads'))

            temp.data._embedded.menuReads.map(obj => obj.id=obj._links.self.href.split("/")[obj._links.self.href.split("/").length - 1])

            this.menuRead = temp.data._embedded.menuReads;
        },
        methods: {
        }
    }
</script>

