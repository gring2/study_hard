/**
 * Created by jinwoopark on 2017. 8. 6..
 */
//import webpack from 'webpack';
var webpack = require('webpack');


module.exports = {
    entry: './src/index.js',

    output: {
        path: __dirname + '/public/',
        filename: 'bundle.js'
    },

    devServer: {
        hot: true,
        inline: true,
        host: '0.0.0.0',
        port: 4000,
        contentBase: __dirname + '/public/',
    },

    module: {
        loaders: [
            {
                test: /\.js$/,
                loaders: ['react-hot',
                            'babel?'+JSON.stringify(
                                {
                                    cacheDirectory: true,
                                    presets:['es2015',
                                            'stage-0',
                                            'react'
                                             ]
                                }
                            ),
                            ],
                exclude: /node_modules/,
            }
        ]
    },
    resolveLoader: {
        moduleExtensions: ['-loader']
    },
    plugins: [
        new webpack.HotModuleReplacementPlugin()
    ]
};