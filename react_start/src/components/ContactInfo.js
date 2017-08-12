/**
 * Created by jinwoopark on 2017. 8. 6..
 */
import React from 'react'

export default class ContactInfo extends React.Component{
    render(){
        return(
            <div onClick={this.props.onClick}>{this.props.contact.name}
                </div>
        )
    }

}